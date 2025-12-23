package com.jsp.assinmentmap3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pen {

	@Id
	private int id;
	private String name;
	private String brand;
	private double price;
	@OneToOne
	private Refill refill;
	
	public Pen() {}

	public Pen(int id, String name, String brand, double price, Refill refill) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.refill = refill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Refill getRefill() {
		return refill;
	}

	public void setRefill(Refill refill) {
		this.refill = refill;
	}

	
}
