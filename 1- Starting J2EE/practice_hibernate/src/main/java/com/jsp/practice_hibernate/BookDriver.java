package com.jsp.practice_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.practice_hibernate.entity.Book;

public class BookDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Book b1 = new Book(1, "Wings Of Fire", 21.34, "BioGraphy", "APJ Abdul Kalam");
		et.begin();
		em.persist(b1);
		et.commit();	
	}
}
