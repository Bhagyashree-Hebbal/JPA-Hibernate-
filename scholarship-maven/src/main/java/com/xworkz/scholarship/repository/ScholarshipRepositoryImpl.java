package com.xworkz.scholarship.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.scholarship.entity.ScholarshipEntity;

public class ScholarshipRepositoryImpl implements ScholarshipRepository {

	@Override
	public boolean save(ScholarshipEntity scholarshipEntity) {
		System.out.println("This is Repository:" + scholarshipEntity.toString());
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.persist(scholarshipEntity);
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
		return true;
	}

}
