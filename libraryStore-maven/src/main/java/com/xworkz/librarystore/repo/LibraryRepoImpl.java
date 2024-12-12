package com.xworkz.librarystore.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.librarystore.entity.LibraryEntity;

public class LibraryRepoImpl implements LibraryRepo {

	@Override
	public List<LibraryEntity> getBookNameById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("libraryStore");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		List<LibraryEntity> list = null;
		try {
			et.begin();
			Query query = em.createNamedQuery("getBookNameById");
			query.setParameter("id", id);
			list = query.getResultList();
			for (LibraryEntity libraryEntity : list) {
				System.out.println(libraryEntity);
			}
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}
		return list;
	}

	@Override
	public List<Object[]> getAuthorNameAndPriceById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("libraryStore");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		List<Object[]> list = null;
		try {
			et.begin();
			Query query = em.createNamedQuery("getAuthorNameAndPriceById");
			query.setParameter("id", id);
			list = query.getResultList();
			for (Object[] objects : list) {
				System.out.println("AuthorName:" + objects[0]);
				System.out.println("Price:" + objects[1]);
			}
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}
		return list;
	}

}
