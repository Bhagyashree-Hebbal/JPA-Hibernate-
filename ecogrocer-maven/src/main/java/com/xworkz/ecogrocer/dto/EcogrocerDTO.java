package com.xworkz.ecogrocer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ecogrocer_table")
public class EcogrocerDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "product_name")
	private String productName;
	private String category;
	private double price;
	@Column(name = "product_type")
	private String productType;

	public EcogrocerDTO() {
		System.out.println("no-arg const in EcogrocerEntity");
	}

	public EcogrocerDTO(int id, String productName, String category, double price, String productType) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.productType = productType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

}
