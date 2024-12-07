package com.xworkz.shopping.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.shopping.entity.ShoppingEntity;

public class ShoppingRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shopping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<ShoppingEntity> entity = new ArrayList<ShoppingEntity>();
		entity.add(new ShoppingEntity(595620L, "Laptop", "Electronics1", "BrandA", 10, 75000.00, true));
		entity.add(new ShoppingEntity(595621L, "Smartphone", "Electronics2", "BrandB", 25, 30000.00, true));
		entity.add(new ShoppingEntity(595622L, "Headphones", "Electronics3", "BrandC", 50, 2000.00, true));
		entity.add(new ShoppingEntity(595623L, "Television", "Electronics4", "BrandD", 15, 45000.00, true));
		entity.add(new ShoppingEntity(595624L, "Refrigerator", "Appliances1", "BrandE", 5, 55000.00, false));
		entity.add(new ShoppingEntity(595625L, "Washing Machine", "Appliances2", "BrandF", 8, 32000.00, true));
		entity.add(new ShoppingEntity(595626L, "Air Conditioner", "Appliances3", "BrandG", 12, 40000.00, true));
		entity.add(new ShoppingEntity(595627L, "Microwave Oven", "Appliances4", "BrandH", 30, 15000.00, true));
		entity.add(new ShoppingEntity(595628L, "Vacuum Cleaner", "Appliances5", "BrandI", 20, 7000.00, false));
		entity.add(new ShoppingEntity(595629L, "Blender", "Kitchen Appliances1", "BrandJ", 35, 2500.00, true));
		entity.add(new ShoppingEntity(595630L, "Mixer Grinder", "Kitchen Appliances2", "BrandK", 40, 3000.00, true));
		entity.add(new ShoppingEntity(595631L, "Toaster", "Kitchen Appliances3", "BrandL", 60, 1000.00, true));
		entity.add(new ShoppingEntity(595632L, "Dishwasher", "Kitchen Appliances4", "BrandM", 7, 35000.00, false));
		entity.add(new ShoppingEntity(595633L, "Water Purifier", "Kitchen Appliances5", "BrandN", 22, 12000.00, true));
		entity.add(new ShoppingEntity(595634L, "Coffee Maker", "Kitchen Appliances6", "BrandO", 25, 8000.00, true));

		for (ShoppingEntity shoppingEntity : entity) {
			em.persist(shoppingEntity);
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
