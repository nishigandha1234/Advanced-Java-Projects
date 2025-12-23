package com.jsp.laptopCrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LaptopCrud {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;
	private int ram;
	
	public LaptopCrud() {}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "LaptopCrud [id=" + id + ", name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}
	
	
	
}
