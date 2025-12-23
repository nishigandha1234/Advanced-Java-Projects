package com.jsp.bikecrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bikecrud.entity.BikeCrud;

// 			read/fetch
public class BikeCrudFetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		BikeCrud bc1 = new BikeCrud(11,"HayaBuja",1070, "Royal Bike");
		BikeCrud bc2 = new BikeCrud(12,"Hero Honda", 1201, "Honda Type");
		BikeCrud bc3 = new BikeCrud(13,"Royal Enfield", 1002, "Bullet");
		
		
		BikeCrud bikeCrud = em.find(BikeCrud.class, 12);
		System.out.println(bikeCrud);
		
		et.commit();
	}

}
