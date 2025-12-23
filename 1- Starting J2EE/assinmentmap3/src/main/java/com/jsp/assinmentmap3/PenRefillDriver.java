package com.jsp.assinmentmap3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.assinmentmap3.entity.Pen;
import com.jsp.assinmentmap3.entity.Refill;

public class PenRefillDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Refill r1 = new Refill(21, "20", "Blue", "50");
		Pen p1 = new Pen(11, "Ronald", "Classmate", 10.00, r1);
		
		et.begin();
		
		em.persist(p1);
		em.persist(r1);
		
		et.commit();
	}

}
