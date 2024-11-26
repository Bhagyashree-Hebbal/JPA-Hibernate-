package com.xworkz.ecogrocer.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.ecogrocer.dto.EcogrocerDTO;

public class GroceryRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecogrocer");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			Integer id = 5;
			EcogrocerDTO ecogrocer = new EcogrocerDTO();
			EcogrocerDTO value = entityManager.find(EcogrocerDTO.class, id);
			entityManager.remove(value);

			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}

	}

}
