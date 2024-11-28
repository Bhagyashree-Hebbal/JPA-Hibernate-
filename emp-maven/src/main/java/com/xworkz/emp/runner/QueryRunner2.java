package com.xworkz.emp.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.emp.dto.EmpDTO;

public class QueryRunner2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		// get name and ph where age is greater than 15
		// List<EmpDTO> list1 = em.createQuery("select ed.name,ed.phoneNo from EmpDTO ed
		// where ed.age>25 ", EmpDTO.class)
		// .setParameter("name", "Ananya").getResultList();

		// for (EmpDTO dto : list1) {
		// System.out.println("The data List = " + dto.getName() + " , " +
		// dto.getAge());
		// }

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
