package com.jsp.manytooneunimap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {

	@Id
	private int uId;
	private String name;
	private String loc;
	private String uniNo;
	
	public University() {}

	public University(int uId, String name, String loc, String uniNo) {
		super();
		this.uId = uId;
		this.name = name;
		this.loc = loc;
		this.uniNo = uniNo;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
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

	public String getUniNo() {
		return uniNo;
	}

	public void setUniNo(String uniNo) {
		this.uniNo = uniNo;
	}
	
	
	
}
