package com.xworkz.emp.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.emp.dto.Emp2Entity;

public class Emp2Runner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp2");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<Emp2Entity> dto = new ArrayList<Emp2Entity>();
		dto.add(new Emp2Entity("Bhagyashree", "bhagya@gmail.com", 9874563214L, 22, "Bangalore"));
		dto.add(new Emp2Entity("Shanta", "shanta@gmail.com", 8749586214L, 23, "Mysore"));
		dto.add(new Emp2Entity("Sohita", "sohita@gmail.com", 9857595214L, 24, "RajajiNagar"));
		dto.add(new Emp2Entity("Nikita", "nikita@gmail.com", 9874595486L, 17, "Kalburagi"));
		dto.add(new Emp2Entity("Niriksha", "niriksha@gmail.com", 8745963578L, 15, "Mangaluru"));
		dto.add(new Emp2Entity("Aarav", "aarav@gmail.com", 9876543210L, 20, "Chennai"));
		dto.add(new Emp2Entity("Ananya", "ananya@gmail.com", 8765432109L, 14, "Hassan"));
		dto.add(new Emp2Entity("Varun", "varun@gmail.com", 7654321098L, 13, "Belagavi"));
		dto.add(new Emp2Entity("Meera", "meera@gmail.com", 6543210987L, 12, "Tumkur"));
		dto.add(new Emp2Entity("Rohan", "rohan@gmail.com", 4321098765L, 15, "Chitradurga"));

		for (Emp2Entity empDTO : dto) {
			Emp2Entity emp = new Emp2Entity();
			emp.setName(empDTO.getName());
			emp.setEmail(empDTO.getEmail());
			emp.setPhoneNo(empDTO.getPhoneNo());
			emp.setAge(empDTO.getAge());
			emp.setAddress(empDTO.getAddress());

			em.persist(emp);
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
