package com.jsp.manytomanybimap.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Doctor {

	private int did;
	private String name;
	private String education;
	private String specialist;
	List<Patient> patient;
	
	public Doctor() {}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
