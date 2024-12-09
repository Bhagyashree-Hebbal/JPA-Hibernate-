package com.xworkz.scholarship.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScholarshipQuery9 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("deleteByNameAndAge");
			query.setParameter("Kabir", 21);
			int value = query.executeUpdate();
			if (value > 0) {
				System.out.println("deleted");
			} else {
				System.out.println("not deleted");
			}
			et.commit();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			em.close();
			emf.close();
		}

	}
}
