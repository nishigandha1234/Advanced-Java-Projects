package com.jsp.assinmentmap3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.assinmentmap3.entity.Bike;
import com.jsp.assinmentmap3.entity.Engine;

public class BikeEngineDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Engine e1 = new Engine(02, 65, 210, "MVC");
		Bike b1 = new Bike(01, "Royal Enfield", "Bullet", "120ms", e1);
		
		et.begin();
		
		em.persist(b1);
		em.persist(e1);

		et.commit();

	}

}
