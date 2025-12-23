package com.jsp.manytomanyunimap.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student_Table")
public class Stud {

	@Id
	private int stud_no;
	private String name;
	private int age;
	@ManyToMany
	List<Course> course;
	
	public Stud() {}

	public Stud(int stud_no, String name, int age, List<Course> course) {
		super();
		this.stud_no = stud_no;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public int getStud_no() {
		return stud_no;
	}

	public void setStud_no(int stud_no) {
		this.stud_no = stud_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	

	
}
