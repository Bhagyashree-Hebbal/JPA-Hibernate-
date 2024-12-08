package com.xworkz.scholarship.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScholarshipQuery4 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createNamedQuery("getNameAndEmailById");
		query.setParameter("setId", 5);
		int result = query.executeUpdate();

		List<Object[]> li = query.getResultList();
		for (Object[] obj : li) {
			System.out.println("Name: " + obj[0] + " " + "Email: " + obj[1]);
		}

	}

}
