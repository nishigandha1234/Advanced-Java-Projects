package com.jsp.manytomanybimap.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {

	@Id
	private int pid;
	private String name;
	private String disease;
	private int admitDays;
	@ManyToMany
	List<Doctor> doctor;
	
	public Patient() {}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAdmitDays() {
		return admitDays;
	}

	public void setAdmitDays(int admitDays) {
		this.admitDays = admitDays;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}
	
	
}
