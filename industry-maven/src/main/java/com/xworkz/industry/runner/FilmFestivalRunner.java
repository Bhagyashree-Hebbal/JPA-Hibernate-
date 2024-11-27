package com.xworkz.industry.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.industry.dto.FilmFestivalDTO;

public class FilmFestivalRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("industry");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<FilmFestivalDTO> dto = new ArrayList<FilmFestivalDTO>();
		dto.add(new FilmFestivalDTO("KGF Chapter 1", "Prashanth Neel", "Action", "2018", "02:35:00", "2024-12-01 19:00","Grand Theatre", "true", 150.00));
		dto.add(new FilmFestivalDTO("Mungaru Male", "Yograj Bhat", "Romance", "2006", "02:20:00", "2024-12-02 18:00", "Main Hall", "false", 12.00));
		dto.add(new FilmFestivalDTO("Raajakumara", "Santhosh Ananddram", "Drama", "2017", "02:28:00", "2024-12-03 20:00", "Cinema Palace", "false", 14.00));
		dto.add(new FilmFestivalDTO("Kirik Party", "Rishab Shetty", "Comedy", "2016", "02:36:00", "2024-12-04 17:00", "Open Air Theatre", "false", 10.00));
		dto.add(new FilmFestivalDTO("Ugramm", "Prashanth Neel", "Action", "2014", "02:21:00", "2024-12-05 21:00", "Grand Theatre", "false", 13.00));
		dto.add(new FilmFestivalDTO("Lucia", "Pawan Kumar", "Thriller", "2013", "02:15:00", "2024-12-06 19:30", "Main Hall", "true", 16.00));
		dto.add(new FilmFestivalDTO("Bell Bottom", "Jayatheertha", "Crime", "2019", "02:10:00", "2024-12-07 18:30", "Cinema Palace", "false", 11.00));
		dto.add(new FilmFestivalDTO("Tagaru", "Duniya Soori", "Action", "2018", "02:26:00", "2024-12-08 20:00", "Grand Theatre", "false", 13.50));
		dto.add(new FilmFestivalDTO("Ninnindale", "Jayanth C. Paranjee", "Romance", "2014", "02:19:00", "2024-12-09 19:00", "Open Air Theatre", "false", 12.50));
		dto.add(new FilmFestivalDTO("RangiTaranga", "Anup Bhandari", "Mystery", "2015", "02:29:00", "2024-12-10 20:30", "Main Hall", "false", 14.50));
		dto.add(new FilmFestivalDTO("Avane Srimannarayana", "Sachin Ravi", "Fantasy", "2019", "02:56:00", "2024-12-11 18:00", "Cinema Palace", "true", 17.00));
		dto.add(new FilmFestivalDTO("Kotigobba 3", "Shiva Karthik", "Action", "2021", "02:42:00", "2024-12-12 19:00", "Grand Theatre", "false", 14.00));
		dto.add(new FilmFestivalDTO("Googly", "Pawan Wadeyar", "Romance", "2013", "02:24:00", "2024-12-13 18:30", "Open Air Theatre", "false", 12.00));
		dto.add(new FilmFestivalDTO("Doddmane Hudga", "Duniya Soori", "Drama", "2016", "02:46:00", "2024-12-14 20:00", "Main Hall", "false", 13.00));
		dto.add(new FilmFestivalDTO("Gaalipata", "Yograj Bhat", "Comedy", "2008", "02:32:00", "2024-12-15 17:30", "Cinema Palace", "false", 11.50));

		for (FilmFestivalDTO filmFestivalDTO : dto) {
			FilmFestivalDTO filmFestival = new FilmFestivalDTO();
			filmFestival.setFilmTitle(filmFestivalDTO.getFilmTitle());
			filmFestival.setDirector(filmFestivalDTO.getDirector());
			filmFestival.setGenre(filmFestivalDTO.getGenre());
			filmFestival.setReleaseYear(filmFestivalDTO.getReleaseYear());
			filmFestival.setDuration(filmFestivalDTO.getDuration());
			filmFestival.setScreeningDateTime(filmFestivalDTO.getScreeningDateTime());
			filmFestival.setVenue(filmFestivalDTO.getVenue());
			filmFestival.setIsPremiere(filmFestivalDTO.getIsPremiere());
			filmFestival.setTicketPrice(filmFestivalDTO.getTicketPrice());
			
			em.persist(filmFestival);
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
