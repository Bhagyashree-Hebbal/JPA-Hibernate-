package com.xworkz.scholarship.runner;

import java.util.Iterator;
import java.util.List;

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

		Query query = em.createNamedQuery("getNameAndEmailAndPhoneById");
	
		query.setParameter("id", 12);
		List<Object[]> obj =query.getResultList();
		for (Object[] objects : obj) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
			
		}
		
		

	}

}
