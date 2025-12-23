package com.jsp.practice_hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	int bookId;
	String nameOfBook;
	double price;
	String typeOfBook;
	String writer;
	
	public Book() {
		
	}
	
	public Book(int bookId, String nameOfBook, double price, String typeOfBook, String writer)
	{
		this.bookId = bookId;
		this.nameOfBook = nameOfBook;
		this.price = price;
		this.typeOfBook = typeOfBook;
		this.writer = writer;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTypeOfBook() {
		return typeOfBook;
	}

	public void setTypeOfBook(String typeOfBook) {
		this.typeOfBook = typeOfBook;
	}
}
