package com.xworkz.scholarship.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScholarshipQuery5 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createNamedQuery("getCountByEmailAndDate");
		query.setParameter("email", "rohanm34@gmail.com");
		query.setParameter("LocalDate", "2024-1-27");
		String string = (String)query.getSingleResult();
		System.out.println("count is: "+string);

	}

}
