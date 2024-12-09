package com.xworkz.scholarship.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.scholarship.entity.ScholarshipEntity;

public class ScholarshipQuery8 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createNamedQuery("getAllByEmailAndPh");
		query.setParameter("email", "meerat32@gmail.com");
		query.setParameter("phone", 9874563223L);
		
		Object obj =query.getSingleResult();
		ScholarshipEntity entity=(ScholarshipEntity)obj;
		
		System.out.println(entity.toString());
		
		
		
		
		
		
		
		
		//Query query = em.createNamedQuery("deleteByName&Age");
		//query.setParameter("name", "Vivan");
		//query.setParameter("age", 23);
		//Integer age = (Integer) query.getSingleResult();
		//System.out.println("Age count is: " + age);

	}

}
