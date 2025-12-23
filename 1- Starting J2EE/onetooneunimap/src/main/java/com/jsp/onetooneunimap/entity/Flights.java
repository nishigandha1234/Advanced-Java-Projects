package com.jsp.onetooneunimap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flights {

	@Id
	@Column(name="Flight_Id")
	private String f_id;
	@Column(name="Flight_Name")
	private int f_No;
	@Column(name="Departure_time")
	private String d_time;
	@Column(name="Aparture_time")
	private String a_time;
	private String status;
	
	public Flights()
	{
	}

	public Flights(String f_id, int f_No, String d_time, String a_time, String status) {
		this.f_id = f_id;
		this.f_No = f_No;
		this.d_time = d_time;
		this.a_time = a_time;
		this.status = status;
	}

	public String getF_id() {
		return f_id;
	}

	public void setF_id(String f_id) {
		this.f_id = f_id;
	}

	public int getF_No() {
		return f_No;
	}

	public void setF_No(int f_No) {
		this.f_No = f_No;
	}

	public String getD_time() {
		return d_time;
	}

	public void setD_time(String d_time) {
		this.d_time = d_time;
	}

	public String getA_time() {
		return a_time;
	}

	public void setA_time(String a_time) {
		this.a_time = a_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
