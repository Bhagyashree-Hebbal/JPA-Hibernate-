package com.xworkz.librarystore.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.librarystore.entity.LibraryEntity;

public class LibraryRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("libraryStore");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<LibraryEntity> entity = new ArrayList<LibraryEntity>();

		entity.add(new LibraryEntity("Mookajjiya Kanasugalu", "K. Shivaram Karanth", LocalDate.of(1968, 02, 15), 300));
		entity.add(new LibraryEntity("Malegalalli Madumagalu", "Kuvempu", LocalDate.of(1967, 3, 25), 450));
		entity.add(new LibraryEntity("Parva", "S.L. Bhyrappa", LocalDate.of(1979, 6, 10), 520));
		entity.add(new LibraryEntity("Samskara", "U.R. Ananthamurthy", LocalDate.of(1965, 8, 1), 180));
		entity.add(new LibraryEntity("Bhavamana", "Masti Venkatesha Iyengar", LocalDate.of(1946, 12, 20), 200));

		for (LibraryEntity libraryEntity : entity) {
			em.persist(libraryEntity);
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
