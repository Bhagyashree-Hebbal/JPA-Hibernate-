package com.xworkz.emp.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.emp.dto.EmpDTO;

public class EmpRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<EmpDTO> dto = new ArrayList<EmpDTO>();
		dto.add(new EmpDTO("Bhagyashree", "bhagya@gmail.com", 9874563214L, 22));
		dto.add(new EmpDTO("Shanta", "shanta@gmail.com", 8749586214L, 23));
		dto.add(new EmpDTO("Sohita", "sohita@gmail.com", 9857595214L, 24));
		dto.add(new EmpDTO("Nikita", "nikita@gmail.com", 9874595486L, 25));
		dto.add(new EmpDTO("Niriksha", "niriksha@gmail.com", 8745963578L, 22));
		dto.add(new EmpDTO("Aarav", "aarav@gmail.com", 9876543210L, 26));
		dto.add(new EmpDTO("Ananya", "ananya@gmail.com", 8765432109L, 27));
		dto.add(new EmpDTO("Varun", "varun@gmail.com", 7654321098L, 28));
		dto.add(new EmpDTO("Meera", "meera@gmail.com", 6543210987L, 29));
		dto.add(new EmpDTO("Rohan", "rohan@gmail.com", 4321098765L, 31));

		for (EmpDTO empDTO : dto) {
			EmpDTO emp = new EmpDTO();
			emp.setName(empDTO.getName());
			emp.setEmail(empDTO.getEmail());
			emp.setPhoneNo(empDTO.getPhoneNo());
			emp.setAge(empDTO.getAge());

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
