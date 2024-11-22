package com.xworkz.library.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.library.dto.LibraryEntity;

public class LibraryRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("book");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			LibraryEntity library = new LibraryEntity();
			library.setId(5);
			library.setTitle("1984");
			library.setAuthor("George Orwell");
			library.setBookCode(203);
			library.setTypeOfBook("Dystopian");
			library.setPublishedYear("1949");
			library.setLanguage("English");
			library.setPages(328);
			library.setAvailabilityStatus("available");
			library.setAddedDate("2024-02-05");

			entityManager.persist(library);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}
	}
}
