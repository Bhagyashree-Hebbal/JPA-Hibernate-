package com.xworkz.bookStore.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bookStore.entity.BookstoreEntity;

public class BookstoreRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<BookstoreEntity> entity = new ArrayList<BookstoreEntity>();

		entity.add(new BookstoreEntity(1051, "Mookajjiya Kanasugalu", "K. Shivaram Karanth", "Novel", 300));
		entity.add(new BookstoreEntity(1052, "Malegalalli Madumagalu", "Kuvempu", "Novel", 280));
		entity.add(new BookstoreEntity(1053, "Parva", "S.L. Bhyrappa", "Novel", 350));
		entity.add(new BookstoreEntity(1054, "Samskara", "U.R. Ananthamurthy", "Novel", 320));
		entity.add(new BookstoreEntity(1055, "Kusumabale", "Devanuru Mahadeva", "Novel", 300));
		entity.add(new BookstoreEntity(1056, "Bhavamana", "Masti Venkatesha Iyengar", "Novel", 270));
		entity.add(new BookstoreEntity(1057, "Chomana Dudi", "Shivaram Karanth", "Novel", 250));
		entity.add(new BookstoreEntity(1058, "Vamshavriksha", "S.L. Bhyrappa", "Novel", 330));
		entity.add(new BookstoreEntity(1059, "Tabbaliyu Neenade Magane", "S.L. Bhyrappa", "Novel", 310));
		entity.add(new BookstoreEntity(1060, "Yayati", "V.S. Khandekar", "Novel", 400));

		for (BookstoreEntity bookstoreEntity : entity) {
			em.persist(bookstoreEntity);
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
