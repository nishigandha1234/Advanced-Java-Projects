package com.jsp.cacheable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.cacheable.entity.Mobile;

public class MobileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Mobile m1 = new Mobile(101, "Oppo", "A71", 256);
		Mobile mob = em.find(Mobile.class, 101);
		System.out.println(mob);
		
		Mobile m2 = new Mobile(102, "Samsung", "S24", 314);
		Mobile mob1 = em.find(Mobile.class, 102);
		System.out.println(mob1);
		
		et.begin();
		
		em.persist(m1);
		em.persist(m2);
		et.commit();
		
	
	}

}
