package com.jsp.compositekey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.compositekey.entity.CompositeColumn;
import com.jsp.compositekey.entity.Marksheet;

public class CompositeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		CompositeColumn c1 = new CompositeColumn();
		c1.setName("Narayan");
		c1.setSubject	("Java");
		
		Marksheet m1 = new Marksheet();
		m1.setMarks(95);
		m1.setColumn(c1);
		
		CompositeColumn c2 = new CompositeColumn();
		c2.setName("Nakshatra");
		c2.setSubject("Science");
		
		Marksheet m2 = new Marksheet();
		m2.setMarks(60);
		m2.setColumn(c2);
		
		et.begin();
		
		em.persist(m1);
		em.persist(m2);
		et.commit();
	}

}
