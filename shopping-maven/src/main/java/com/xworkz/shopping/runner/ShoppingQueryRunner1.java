package com.xworkz.shopping.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.shopping.entity.ShoppingEntity;

public class ShoppingQueryRunner1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shopping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query1 = em.createNamedQuery("findByProductId");
		query1.setParameter("productId", 595622L);
		Object object1 = query1.getSingleResult();
		ShoppingEntity shoppingEntity = (ShoppingEntity) object1;
		System.out.println("Value of the Professor Id :" + shoppingEntity);

	}

}
