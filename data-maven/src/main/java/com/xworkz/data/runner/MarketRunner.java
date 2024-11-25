package com.xworkz.data.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.data.dto.MarketEntity;

public class MarketRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("send");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			MarketEntity market = new MarketEntity();
			market.setId(6);
			market.setMarketName("South Valley Market"); 
			market.setLocation("South City"); 
			market.setMarketType("Artisan Market"); 
			market.setOperatingHours(7);
			entityManager.persist(market);
			entityManager.merge(market);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			emf.close();
		}

	}

}
