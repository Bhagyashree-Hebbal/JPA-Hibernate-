package com.xworkz.ecogrocer.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.ecogrocer.dto.EcogrocerDTO;

public class EcogrocerRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecogrocer");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			EcogrocerDTO ecogrocer = new EcogrocerDTO(10, "Kale Chips", "Snacks", 5.99, "Gluten-Free");

			entityManager.persist(ecogrocer);

			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}
	}
}
