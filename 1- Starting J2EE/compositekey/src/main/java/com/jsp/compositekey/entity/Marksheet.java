package com.jsp.compositekey.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Marksheet {

	private int marks;
	
	@EmbeddedId
	private CompositeColumn column;
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public CompositeColumn getColumn() {
		return column;
	}
	public void setColumn(CompositeColumn column) {
		this.column = column;
	}
	
	
}
