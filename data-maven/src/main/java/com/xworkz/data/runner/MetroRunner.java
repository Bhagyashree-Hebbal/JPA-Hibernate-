package com.xworkz.data.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.data.dto.MetroEntity;

public class MetroRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("send");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			MetroEntity metro = new MetroEntity();
			metro.setId(6); 
			metro.setMetroName("Yellow Line"); 
			metro.setNoOfMembers(1400); 
			metro.setSource("Majestic"); 
			metro.setDestination("Bommasandra");
			entityManager.persist(metro);
			entityManager.merge(metro);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}

	}

}
