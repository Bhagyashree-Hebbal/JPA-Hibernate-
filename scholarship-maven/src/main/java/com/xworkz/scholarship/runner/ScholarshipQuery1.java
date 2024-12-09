package com.xworkz.scholarship.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScholarshipQuery1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("updateByEmailAndPhone");
			query.setParameter("email", "riyak12@gmail.com");
			query.setParameter("phone", 9874563227L);
			query.setParameter("course", "Business Administration");
			int result = query.executeUpdate();
			if (result > 0) {
				System.out.println("updated");
			} else {
				System.out.println("not updated");
			}
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

	}

}
