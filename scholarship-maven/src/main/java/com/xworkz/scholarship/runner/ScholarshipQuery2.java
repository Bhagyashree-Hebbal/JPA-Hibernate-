package com.xworkz.scholarship.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScholarshipQuery2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("updateByPhoneAndAlive");
			query.setParameter("email", "guna@gmail.com");
			query.setParameter("phone", 9874563225L);
			query.setParameter("alive", true);
			int result = query.executeUpdate();
			if (result > 0) {
				System.out.println("updated");

			} else {
				System.out.println("not updated");
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
