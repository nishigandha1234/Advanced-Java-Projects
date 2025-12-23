package com.jsp.assignmentmapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Organization {

	@Id
	private int id;
	private String name;
	private String loc;
	private int developYear;
	
	public Organization() {}

	public Organization(int id, String name, String loc, int developYear) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.developYear = developYear;
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

	public int getSpeciality() {
		return developYear;
	}

	public void setSpeciality(int developYear) {
		this.developYear= developYear ;
	}

	
	
}
