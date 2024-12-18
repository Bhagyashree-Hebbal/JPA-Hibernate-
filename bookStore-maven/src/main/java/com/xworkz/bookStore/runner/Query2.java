package com.xworkz.bookStore.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Query2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("getTitleByAuthor");
			query.setParameter("author", "Masti Venkatesha Iyengar");
			String str = (String) query.getSingleResult();
			System.out.println(str);
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}

	}

}
