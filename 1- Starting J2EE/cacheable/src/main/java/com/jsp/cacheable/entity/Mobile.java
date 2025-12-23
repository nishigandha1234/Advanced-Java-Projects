package com.jsp.cacheable.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cacheable
public class Mobile {
	@Id
	private int mid;
	private String name;
	private String version;
	private int memory;
	
	public Mobile() {}

	public Mobile(int mid, String name, String version, int memory) {
		super();
		this.mid = mid;
		this.name = name;
		this.version = version;
		this.memory = memory;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", name=" + name + ", version=" + version + ", memory=" + memory + "]";
	}
	
	

}
