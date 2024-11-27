package com.xworkz.industry.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "filmfestival_table")
public class FilmFestivalDTO {

	@Id
	@GenericGenerator(name = "film", strategy = "increment")
	@GeneratedValue(generator = "film")
	private int id;

	@Column(name = "film_title")
	private String filmTitle;

	private String director;

	private String genre;

	@Column(name = "release_year")
	private String releaseYear;

	private String duration;

	@Column(name = "screening_date_time")
	private String screeningDateTime;

	private String venue;

	@Column(name = "is_premiere")
	private String isPremiere;

	@Column(name = "ticket_price")
	private double ticketPrice;

	public FilmFestivalDTO() {
		System.out.println("No-arg const");
	}

	public FilmFestivalDTO(String filmTitle, String director, String genre, String releaseYear, String duration,
			String screeningDateTime, String venue, String isPremiere, double ticketPrice) {
		super();
		this.filmTitle = filmTitle;
		this.director = director;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.duration = duration;
		this.screeningDateTime = screeningDateTime;
		this.venue = venue;
		this.isPremiere = isPremiere;
		this.ticketPrice = ticketPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilmTitle() {
		return filmTitle;
	}

	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getScreeningDateTime() {
		return screeningDateTime;
	}

	public void setScreeningDateTime(String screeningDateTime) {
		this.screeningDateTime = screeningDateTime;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getIsPremiere() {
		return isPremiere;
	}

	public void setIsPremiere(String isPremiere) {
		this.isPremiere = isPremiere;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}
