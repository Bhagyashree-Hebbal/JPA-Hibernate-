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
		entity.add(new ShoppingEntity(595620L, "Laptop", "Electronics", "BrandA", 10, 75000.00, true));
		entity.add(new ShoppingEntity(595621L, "Smartphone", "Electronics", "BrandB", 25, 30000.00, true));
		entity.add(new ShoppingEntity(595622L, "Headphones", "Electronics", "BrandC", 50, 2000.00, true));
		entity.add(new ShoppingEntity(595623L, "Television", "Electronics", "BrandD", 15, 45000.00, true));
		entity.add(new ShoppingEntity(595624L, "Refrigerator", "Appliances", "BrandE", 5, 55000.00, false));
		entity.add(new ShoppingEntity(595625L, "Washing Machine", "Appliances", "BrandF", 8, 32000.00, true));
		entity.add(new ShoppingEntity(595626L, "Air Conditioner", "Appliances", "BrandG", 12, 40000.00, true));
		entity.add(new ShoppingEntity(595627L, "Microwave Oven", "Appliances", "BrandH", 30, 15000.00, true));
		entity.add(new ShoppingEntity(595628L, "Vacuum Cleaner", "Appliances", "BrandI", 20, 7000.00, false));
		entity.add(new ShoppingEntity(595629L, "Blender", "Kitchen Appliances", "BrandJ", 35, 2500.00, true));
		entity.add(new ShoppingEntity(595630L, "Mixer Grinder", "Kitchen Appliances", "BrandK", 40, 3000.00, true));
		entity.add(new ShoppingEntity(595631L, "Toaster", "Kitchen Appliances", "BrandL", 60, 1000.00, true));
		entity.add(new ShoppingEntity(595632L, "Dishwasher", "Kitchen Appliances", "BrandM", 7, 35000.00, false));
		entity.add(new ShoppingEntity(595633L, "Water Purifier", "Kitchen Appliances", "BrandN", 22, 12000.00, true));
		entity.add(new ShoppingEntity(595634L, "Coffee Maker", "Kitchen Appliances", "BrandO", 25, 8000.00, true));

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
