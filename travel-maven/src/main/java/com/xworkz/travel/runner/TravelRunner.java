package com.xworkz.travel.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.travel.dto.TravelEntity;

public class TravelRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("travel");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			TravelEntity travel = new TravelEntity();
			travel.setBooking_id(5); 
			travel.setCustomer_id(1005); 
			travel.setFlight_id(5005); 
			travel.setBooking_date("2024-06-01"); 
			travel.setDeparture_date("2024-06-10"); 
			travel.setReturn_date("2024-06-20"); 
			travel.setDeparture_airport("Netaji Subhash Chandra Bose International Airport"); 
			travel.setArrival_airport("Chhatrapati Shivaji Maharaj International Airport"); 
			travel.setBooking_status("cancelled"); 
			travel.setPayment_status("failed");
			entityManager.persist(travel);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}
	}
}
