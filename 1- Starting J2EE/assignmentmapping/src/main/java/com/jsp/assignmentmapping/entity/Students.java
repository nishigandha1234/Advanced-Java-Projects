package com.jsp.assignmentmapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Students {
	@Id
	private int id;
	private String name;
	private String degree;
	private String branch;
	@ManyToOne
	private Organization organization;
	
	public Students(){}

	public Students(int id, String name, String degree, String branch, Organization organization) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.branch = branch;
		this.organization = organization;
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
	
	
	
}
