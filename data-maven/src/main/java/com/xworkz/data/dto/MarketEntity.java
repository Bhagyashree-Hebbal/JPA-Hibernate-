package com.xworkz.data.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "market_table")
public class MarketEntity {

	@Id
	private int id;

	@Column(name = "market_name")
	private String marketName;

	private String location;

	@Column(name = "market_type")
	private String marketType;

	@Column(name = "operating_hours")
	private int operatingHours;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMarketType() {
		return marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public int getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(int operatingHours) {
		this.operatingHours = operatingHours;
	}

}
