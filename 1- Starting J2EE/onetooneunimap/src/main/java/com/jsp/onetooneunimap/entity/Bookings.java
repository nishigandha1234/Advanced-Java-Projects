package com.jsp.onetooneunimap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bookings {

	@Id
	@Column(name = "BookingId")
	private int b_id;
	@Column(name="BookingDate")
	private String b_date;
	@Column(name="SeatNO")
	private int seat_no;
	@Column(name="ClassOfFlight")
	private String class_of_Flight;
	@Column(name="Price")
	private double price;
	@OneToOne
	private Flights flights;
	
	public Bookings() {}

	public Bookings(int b_id, String b_date, int seat_no, String class_of_Flight, double price, Flights flights) {
		this.b_id = b_id;
		this.b_date = b_date;
		this.seat_no = seat_no;
		this.class_of_Flight = class_of_Flight;
		this.price = price;
		this.flights = flights;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public int getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}

	public String getClass_of_Flight() {
		return class_of_Flight;
	}

	public void setClass_of_Flight(String class_of_Flight) {
		this.class_of_Flight = class_of_Flight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Flights getFlights() {
		return flights;
	}

	public void setFlights(Flights flights) {
		this.flights = flights;
	}
	
	
}
