package com.jsp.bikecrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BikeCrud {
	
	@Id
	@Column(name="bike_id")
	private int bikeId;
	@Column(name="bike_name")
	private String bikeName;
	@Column(name="bike_Number")
	private int bikeNumber;
	@Column(name="bike_type")
	private String bikeType;
	
	public BikeCrud()
	{
		
	}
	
	public BikeCrud(int bikeId, String bikeName, int bikeNumber, String bikeType)
	{
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikeNumber = bikeNumber;
		this.bikeType = bikeType;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public int getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(int bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	@Override
	public String toString() {
		return "BikeCrud [bikeId=" + bikeId + ", bikeName=" + bikeName + ", bikeNumber=" + bikeNumber + ", bikeType="
				+ bikeType + "]";
	}
	
	
	

}
