package com.jsp.assinmentmap3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike {

	@Id
	private int id;
	private String name;
	private String type;
	private String speed;
	@OneToOne
	private Engine engine;
	
	public Bike() {}

	public Bike(int id, String name, String type, String speed, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.speed = speed;
		this.engine = engine;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
}
