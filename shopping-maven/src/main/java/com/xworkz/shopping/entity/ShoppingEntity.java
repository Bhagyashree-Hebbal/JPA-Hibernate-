package com.xworkz.shopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "shopping_table")
@NamedQuery(name = "findByProductId", query = "Select se from ShoppingEntity se where se.productId= :productId")
@NamedQuery(name="findAll", query="Select se from ShoppingEntity se")
@NamedQuery(name="findProductNameByCategory", query="Select se.productName from ShoppingEntity se where se.category= :category")
@NamedQuery(name = "findProductNameByPrice", query = "Select se.price from ShoppingEntity se where se.price = :setPrice")
@NamedQuery(name="findCategoryByisAvailable", query="Select se.isAvailable from ShoppingEntity se where se.isAvailable= :setIsAvailable")
public class ShoppingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "product_id")
	private long productId;
	@Column(name = "product_name")
	private String productName;
	private String category;
	private String brand;
	private int quantity;
	private double price;
	@Column(name = "is_available")
	private boolean isAvailable;

	public ShoppingEntity() {

	}

	public ShoppingEntity(long productId, String productName, String category, String brand, int quantity, double price,
			boolean isAvailable) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "ShoppingEntity [id=" + id + ", productId=" + productId + ", productName=" + productName + ", category="
				+ category + ", brand=" + brand + ", quantity=" + quantity + ", price=" + price + ", isAvailable="
				+ isAvailable + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
