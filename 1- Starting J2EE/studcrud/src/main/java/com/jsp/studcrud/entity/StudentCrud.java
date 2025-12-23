package com.jsp.studcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentCrud {
	
	@Id
	@Column(name = "stud_Id")
	private int studId;
	@Column(name = "stud_name")
	private String name;
	@Column(name = "stud_DOB")
	private String studDOB;
	@Column(name = "stud_adhar")
	private long adharNo;
	@Column(name = "stud_mbno")
	private long mobile;
	
	public StudentCrud()
	{
		
	}
	
	public StudentCrud(int studId, String name, String studDOB, long adharNo, long mobile)
	{
		this.studId = studId;
		this.name = name;
		this.studDOB = studDOB;
		this.adharNo = adharNo;
		this.mobile = mobile;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudDOB() {
		return studDOB;
	}

	public void setStudDOB(String studDOB) {
		this.studDOB = studDOB;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "StudentCrud [studId=" + studId + ", name=" + name + ", studDOB=" + studDOB + ", adharNo=" + adharNo
				+ ", mobile=" + mobile + "]";
	}
	

}
