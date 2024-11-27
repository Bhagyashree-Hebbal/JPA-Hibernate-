package com.xworkz.industry.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.industry.dto.FilmFestivalDTO;

public class FetchDataRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("industry");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Integer id = 4;
		FilmFestivalDTO dto = em.find(FilmFestivalDTO.class, id);
		System.out.println("The data is:" + dto.getFilmTitle() + "," + dto.getDirector() + "," + dto.getGenre() + ","
				+ dto.getReleaseYear() + "," + dto.getDuration() + "," + dto.getScreeningDateTime() + ","
				+ dto.getVenue() + "," + dto.getIsPremiere() + "," + dto.getTicketPrice());

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
