package com.jsp.practice_hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marker_data")
public class Marker {

	@Id
	@Column(name="m_id")
	private int markerId;
	@Column(name="m_color")
	private String color;
	@Column(name="m_nibSize")
	private String nibSize;
	@Column(name="m_brand")
	private String brand;
	@Column(name="m_price")
	private double price;
	
	public Marker()
	{
		
	}
	
	public Marker(int marketId, String color, String nibSize, String brand, double price)
	{
		this.markerId = marketId;
		this.color = color;
		this.brand = brand;
		this.nibSize =nibSize;
		this.price = price;
		
	}

	public int getMarkerId() {
		return markerId;
	}

	public void setMarkerId(int markerId) {
		this.markerId = markerId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNibSize() {
		return nibSize;
	}

	public void setNibSize(String nibSize) {
		this.nibSize = nibSize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Marker [markerId=" + markerId + ", color=" + color + ", nibSize=" + nibSize + ", brand=" + brand
				+ ", price=" + price + "]";
	}
	
	
}

