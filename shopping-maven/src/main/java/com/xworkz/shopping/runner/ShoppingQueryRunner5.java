package com.xworkz.shopping.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ShoppingQueryRunner5 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shopping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createNamedQuery("findCategoryByisAvailable");
		query.setParameter("isAvailable", false);
		Object object = query.getSingleResult();
		Boolean ref = (Boolean) object;
		System.out.println("Value of the Professor Id :" + ref);
		
	}

}
