package com.jsp.assinmentmap3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Refill {

	@Id
	private int id;
	private String capacity;
	private String color;
	private String size;
	
	public Refill() {}

	public Refill(int id, String capacity, String color, String size) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.color = color;
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
