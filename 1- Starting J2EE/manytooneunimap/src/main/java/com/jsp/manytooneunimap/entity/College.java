package com.jsp.manytooneunimap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class College {
	@Id
	private int id;
	private String name;
	private String loc;
	private int noOfBus;
	@ManyToOne
	private University university;
	
	public College() {}

	public College(int id, String name, String loc, int noOfBus, University university) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.noOfBus = noOfBus;
		this.university = university;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getNoOfBus() {
		return noOfBus;
	}

	public void setNoOfBus(int noOfBus) {
		this.noOfBus = noOfBus;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
	
	
	
}
