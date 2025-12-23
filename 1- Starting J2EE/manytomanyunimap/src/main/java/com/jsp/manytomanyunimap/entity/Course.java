package com.jsp.manytomanyunimap.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Course {

	@Id
	private int cid;
	private String name;
	private double fees;
	private String duration;
	@ManyToMany
	private List<Stud> stud;
	
	public Course() {}

	public Course(int cid, String name, double fees, String duration, List<Stud> stud) {
		super();
		this.cid = cid;
		this.name = name;
		this.fees = fees;
		this.duration = duration;
		this.stud = stud;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<Stud> getStud() {
		return stud;
	}

	public void setEmployees(List<Stud> stud) {
		this.stud = stud;
	}

	
	
}
