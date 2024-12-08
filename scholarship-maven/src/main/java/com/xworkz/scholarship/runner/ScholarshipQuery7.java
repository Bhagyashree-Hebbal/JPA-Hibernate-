package com.xworkz.scholarship.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScholarshipQuery7 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createNamedQuery("getNameAndEmailAndPhoneAndById");
		query.setParameter("name", "Vivan");
		query.setParameter("email", "vivana56@gmail.com");
		query.setParameter("phone", 9874563226L);
		Integer age = (Integer) query.getSingleResult();
		System.out.println("Age count is: " + age);

	}

}
