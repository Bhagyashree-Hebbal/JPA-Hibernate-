package com.xworkz.travelPlaces.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.xworkz.travelPlaces.entity.TravelPlacesEntity;

@Repository
public class TravelPlacesRepositoryImpl implements TravelPlacesRepository {

	@Override
	public boolean save(TravelPlacesEntity entity) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("travelPlaces");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.persist(entity);
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}
		return true;
	}

}
