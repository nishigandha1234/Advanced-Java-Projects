package com.jsp.assinmentmap3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {

	@Id
	private int id;
	private int cc;
	private int mileage;
	private String name;
	
	public Engine() {}

	public Engine(int id, int cc, int mileage, String name) {
		super();
		this.id = id;
		this.cc = cc;
		this.mileage = mileage;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
