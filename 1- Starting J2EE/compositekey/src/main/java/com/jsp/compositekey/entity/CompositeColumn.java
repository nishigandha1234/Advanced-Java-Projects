package com.jsp.compositekey.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompositeColumn implements Serializable{

	private String name;
	private String subject;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
