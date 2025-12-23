package com.jsp.onetoonebimap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetoonebimap.entity.Pancard;
import com.jsp.onetoonebimap.entity.Person;

public class PersonPancardDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p1 = new Person();
		p1.setPid(101);
		p1.setName("Shyam");
		p1.setAge(22);
		
		Pancard p2 = new Pancard();
		p2.setpNO("DY123");
		p2.setAddress("deccan");
		p2.setPincode(124522);
		p1.setPancard(p2);
		p2.setPerson(p1);
		
		et.begin();
		
		em.persist(p1);
		em.persist(p2);
		
		et.commit();
		
	}
	

}
