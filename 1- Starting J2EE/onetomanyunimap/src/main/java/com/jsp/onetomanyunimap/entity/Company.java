package com.jsp.onetomanyunimap.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@Column(name="company_id")
	private int id;
	@Column(name="company_name")
	private String name;
	@Column(name="company_loc")
	private String loc;
	@OneToMany
	private List<Employee>employees;
	
	public Company()
	{}

	public Company(int id, String name, String loc, List<Employee>employees) {
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.employees = employees;
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

	public List<Employee> getEmployee(){
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
