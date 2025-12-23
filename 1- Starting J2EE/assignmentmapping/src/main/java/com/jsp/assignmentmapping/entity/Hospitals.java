package com.jsp.assignmentmapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospitals {

	@Id
	private int id;
	private String name;
	private String loc;
	private String Speciality;
	
	public Hospitals() {}

	public Hospitals(int id, String name, String loc, String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		Speciality = speciality;
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

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	
	
}
