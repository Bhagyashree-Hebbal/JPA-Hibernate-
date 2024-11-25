package com.xworkz.healthcare.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.healthcare.dto.HealthcareEntity;

public class HealthcareRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("health");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			HealthcareEntity healthcare = new HealthcareEntity();
			healthcare.setPatient_id(5);
			healthcare.setFirst_name("Amit");
			healthcare.setLast_name("Kapoor");
			healthcare.setDob("2000-07-15");
			healthcare.setGender("Male");
			healthcare.setPhone(9123456791L);
			healthcare.setEmail("amit.kapoor@example.com");
			healthcare.setAddress("Delhi");
			healthcare.setInsurance_id(255);
			healthcare.setRegistration_date("2023-11-27");
			entityManager.persist(healthcare);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}
	}
}
