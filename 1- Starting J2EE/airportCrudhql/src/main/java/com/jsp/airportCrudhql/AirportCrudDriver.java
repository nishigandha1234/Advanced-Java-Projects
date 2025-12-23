package com.jsp.airportCrudhql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.airportCrudhql.entity.AirportCrud;

public class AirportCrudDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//1st operation save using persist
//		AirportCrud a1 = new AirportCrud();
//		a1.setName("Chhatrapati Shivaji International Airport");
//		a1.setCity("Mumbai");
//		a1.setCountry("India");
//		a1.setCode("BOM");
//		a1.setCapacity(85000);
//		
//		AirportCrud a2 = new AirportCrud();
//		a2.setName("Indira Gandhi International Airport");
//		a2.setCity("Delhi");
//		a2.setCountry("India");
//		a2.setCode("DEL");
//		a2.setCapacity(120000);
//
//		AirportCrud a3 = new AirportCrud();
//		a3.setName("Dubai International Airport");
//		a3.setCity("Dubai");
//		a3.setCountry("UAE");
//		a3.setCode("DXB");
//		a3.setCapacity(150000);
//
//		AirportCrud a4 = new AirportCrud();
//		a4.setName("Pune International Airport");
//		a4.setCity("Pune");
//		a4.setCountry("PUE");
//		a4.setCode("CXV");
//		a4.setCapacity(200000);
//		
//		et.begin();
//		em.persist(a1);
//		em.persist(a2);
//		em.persist(a3);
//		em.persist(a4);
//		et.commit();
	
//------------------------------------------------------------------------------------------
		
		//2nd operation select
		
//		Query q = em.createQuery("from AirportCrud a");
//		List<AirportCrud> rs = q.getResultList();
//		for (AirportCrud airportCrud : rs) {
//			System.out.println(airportCrud);
//		}
//		
//------------------------------------------------------------------------------------------		
		
		//3rd operation update 
		
		//1st way named parameter 
		
//		et.begin();
//		Query q = em.createQuery("update AirportCrud a set a.name = :myName where a.id = :myId");
//		q.setParameter("myName", "C. Shivaji International Airport");
//		q.setParameter("myId", 1);
//		int ex = q.executeUpdate();
//		System.out.println("ex : "+ex);
//		et.commit();
		
		//2nd using positional paramter
		
//		et.begin();
//		Query q1 = em.createQuery("update AirportCrud a set a.name = ?2 where a.id = ?1");
//		q1.setParameter(2, "I. Gandhi National Airport");
//		q1.setParameter(1, 2);
//		int ex = q1.executeUpdate();
//		System.out.println("ex : "+ex);
//		et.commit();
	
		
//------------------------------------------------------------------------------------------	
		
		//4th delete operation 
		
		//1st way named parameter
//		et.begin();
//		Query q = em.createQuery("delete from AirportCrud a where a.id = :myId");
//		q.setParameter("myId", 4);
//		int ex = q.executeUpdate();
//		System.out.println("ex : "+ex);
//		et.commit();
		
		//2nd way positional parameter
		et.begin();
		Query e = em.createQuery("delete from AirportCrud e where e.id = ?1");
		e.setParameter(1, 3);
		int ex = e.executeUpdate();
		System.out.println(ex);
		et.commit();
//		
		
	}

}
