package com.xworkz.scholarship.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.scholarship.entity.ScholarshipEntity;

public class ScholarshipRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("scholarship");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<ScholarshipEntity> entity = new ArrayList<ScholarshipEntity>();
		entity.add(new ScholarshipEntity("Tanvi", "tanvi24@gmail.com", 9874563215L, 23, "Computer Science",LocalDate.of(2024, 1, 15), LocalDate.of(2024, 2, 10), true, 20000, "Approved"));
		entity.add(new ScholarshipEntity("Aarav", "aarav25@gmail.com", 9874563216L, 21, "Mechanical Engineering", LocalDate.of(2024, 1, 18), LocalDate.of(2024, 2, 12), true, 18000, "Approved")); 
		entity.add(new ScholarshipEntity("Diya", "diyad76@gmail.com", 9874563217L, 22, "Electrical Engineering", LocalDate.of(2024, 1, 20), LocalDate.of(2024, 2, 15), true, 17000, "Pending")); 
		entity.add(new ScholarshipEntity("Ishaan", "ishaank89@gmail.com", 9874563218L, 24, "Civil Engineering", LocalDate.of(2024, 1, 22), LocalDate.of(2024, 2, 17), true, 16000, "Approved")); 
		entity.add(new ScholarshipEntity("Kiara", "kiarap01@gmail.com", 9874563219L, 23, "Biotechnology", LocalDate.of(2024, 1, 25), LocalDate.of(2024, 2, 19), false, 19000, "Pending")); 
		entity.add(new ScholarshipEntity("Rohan", "rohanm34@gmail.com", 9874563220L, 22, "Information Technology", LocalDate.of(2024, 1, 27), LocalDate.of(2024, 2, 20), true, 21000, "Approved")); 
		entity.add(new ScholarshipEntity("Ananya", "ananyad78@gmail.com", 9874563221L, 24, "Physics", LocalDate.of(2024, 1, 30), LocalDate.of(2024, 2, 21), true, 20000, "Rejected")); 
		entity.add(new ScholarshipEntity("Aryan", "aryans65@gmail.com", 9874563222L, 21, "Chemistry", LocalDate.of(2024, 2, 1), LocalDate.of(2024, 2, 22), true, 22000, "Pending")); 
		entity.add(new ScholarshipEntity("Meera", "meerat32@gmail.com", 9874563223L, 19, "Mathematics", LocalDate.of(2024, 2, 3), LocalDate.of(2024, 2, 23), true, 23000, "Approved")); 
		entity.add(new ScholarshipEntity("Karan", "karanj21@gmail.com", 9874563224L, 23, "Architecture", LocalDate.of(2024, 2, 5), LocalDate.of(2024, 2, 24), false, 24000, "Rejected")); 
		entity.add(new ScholarshipEntity("Maya", "mayar89@gmail.com", 9874563225L, 22, "Business Administration", LocalDate.of(2024, 2, 8), LocalDate.of(2024, 2, 25), true, 25000, "Approved")); 
		entity.add(new ScholarshipEntity("Vivan", "vivana56@gmail.com", 9874563226L, 20, "Economics", LocalDate.of(2024, 2, 10), LocalDate.of(2024, 2, 26), true, 26000, "Pending")); 
		entity.add(new ScholarshipEntity("Riya", "riyak12@gmail.com", 9874563227L, 24, "Political Science", LocalDate.of(2024, 2, 12), LocalDate.of(2024, 2, 27), false, 27000, "Approved")); 
		entity.add(new ScholarshipEntity("Arjun", "arjuns34@gmail.com", 9874563228L, 23, "Psychology", LocalDate.of(2024, 2, 15), LocalDate.of(2024, 2, 28), true, 28000, "Pending")); 
		entity.add(new ScholarshipEntity("Sneha", "snehap78@gmail.com", 9874563229L, 22, "Sociology", LocalDate.of(2024, 2, 17), LocalDate.of(2024, 2, 29), true, 29000, "Approved")); 
		entity.add(new ScholarshipEntity("Yuva", "yuvab45@gmail.com", 9874563230L, 20, "Anthropology", LocalDate.of(2024, 2, 20), LocalDate.of(2024, 3, 1), true, 30000, "Rejected")); 
		entity.add(new ScholarshipEntity("Priya", "priyat67@gmail.com", 9874563231L, 19, "History", LocalDate.of(2024, 2, 22), LocalDate.of(2024, 3, 2), true, 31000, "Pending")); 
		entity.add(new ScholarshipEntity("Kabir", "kabirh89@gmail.com", 9874563232L, 21, "Philosophy", LocalDate.of(2024, 2, 24), LocalDate.of(2024, 3, 3), false, 32000, "Approved")); 
		entity.add(new ScholarshipEntity("Sara", "saraz34@gmail.com", 9874563233L, 23, "Literature", LocalDate.of(2024, 2, 26), LocalDate.of(2024, 3, 4), true, 33000, "Rejected")); 
		entity.add(new ScholarshipEntity("Isha", "ishad67@gmail.com", 9874563234L, 22, "Fine Arts", LocalDate.of(2024, 2, 28), LocalDate.of(2024, 3, 5), true, 34000, "Approved"));
		
		for (ScholarshipEntity scholarshipEntity : entity) {
			em.persist(scholarshipEntity);
		}

		try {
			et.begin();
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
