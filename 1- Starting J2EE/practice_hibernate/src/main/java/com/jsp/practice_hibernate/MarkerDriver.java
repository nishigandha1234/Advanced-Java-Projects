package com.jsp.practice_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.practice_hibernate.entity.Marker;

public class MarkerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Marker m1 = new Marker(10,"Blue", "1.5 inch", "Camel", 120.00);
		Marker m2 = new Marker(20, "Red", "1.5 inch", "Classmate", 200.00);
		Marker m3 = new Marker(30, "Black", "2.5 inch", "Camel",120.3);
		
		et.begin();
//		save/insert operation
//		em.persist(m1);
//		em.persist(m2);
//		em.persist(m3);
		
		
		//fetch/read operation
//		Marker marker = em.find(Marker.class, 10);
//		System.out.println(marker);
		
		
		//delete operation
//		Marker marker = em.find(Marker.class, 10);
//		em.remove(marker);
		
		Marker marker = em.find(Marker.class, 20);
		marker.setBrand("Camel");
		marker.setColor("Black");
		marker.setPrice(100.00);
		em.merge(marker);
		
		Marker marker1 = em.find(Marker.class, 30);
		marker1.setColor("Red");
		em.merge(marker1);
		
		et.commit();
		
		
	}

}
