package com.jsp.onetooneunimap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetooneunimap.entity.Bookings;
import com.jsp.onetooneunimap.entity.Flights;

public class FlightsBookingsDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Flights f1 = new Flights("MU101", 9867, "12.30", "13.45", "DEPARTED");
		Bookings b1 = new Bookings(0124534556, "12-DEC-2025", 32, "BUSINESS", 1750.60, f1);
		
		et.begin();
		em.persist(f1);
		em.persist(b1);
		et.commit();
	}

}
