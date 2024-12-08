package com.xworkz.scholarship.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScholarshipQuery8 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createNamedQuery("deleteByName&Age");
		query.setParameter("name", "Vivan");
		query.setParameter("age", 23);
		Integer age = (Integer) query.getSingleResult();
		System.out.println("Age count is: " + age);

	}

}
