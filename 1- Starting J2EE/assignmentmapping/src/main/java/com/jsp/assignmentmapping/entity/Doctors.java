package com.jsp.assignmentmapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Doctors {
	@Id
	private int id;
	private String name;
	private String SpecialistOrgan;
	private String degree;
	@ManyToOne
	private Hospitals hospital;
	public Doctors() {}
	public Doctors(int id, String name, String specialistOrgan, String degree, Hospitals hospital) {
		this.id = id;
		this.name = name;
		SpecialistOrgan = specialistOrgan;
		this.degree = degree;
		this.hospital = hospital;
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
	public String getSpecialistOrgan() {
		return SpecialistOrgan;
	}
	public void setSpecialistOrgan(String specialistOrgan) {
		SpecialistOrgan = specialistOrgan;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Hospitals getHospital() {
		return hospital;
	}
	public void setHospital(Hospitals hospital) {
		this.hospital = hospital;
	}
	
	
	

}
