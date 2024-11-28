package com.xworkz.emp.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.emp.dto.EmpDTO;

public class QueryRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		//get all
		List<EmpDTO> list = em.createQuery("select ed from EmpDTO ed", EmpDTO.class).getResultList();

		for (EmpDTO dto : list) {
			System.out.println("The data List = " + dto.getId() + " , " + dto.getName() + " , " + dto.getEmail() + " , "
					+ dto.getPhoneNo() + " , " + dto.getAge());
		}

		try {
			et.begin();
			//update by name  and email where ph =""
			int value = em.createQuery("Update EmpDTO set name=:name,email=:email where" + " " + "phoneNo=:phoneNo")
					.setParameter("name", "Pooja").setParameter("email", "pooja@gmail.com")
					.setParameter("phoneNo", 7654321098L).executeUpdate();

			if (value > 0) {
				System.out.println("This is update");
			} else {
				System.out.println("This is not update");
			}
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
