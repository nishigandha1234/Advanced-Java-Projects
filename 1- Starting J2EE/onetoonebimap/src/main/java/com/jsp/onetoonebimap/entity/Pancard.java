package com.jsp.onetoonebimap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {

	@Id
	private String pNO;
	private String address;
	private int pincode;
	
	@OneToOne
	private Person person;
	
	public Pancard() {}

	public String getpNO() {
		return pNO;
	}

	public void setpNO(String pNO) {
		this.pNO = pNO;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	

}
