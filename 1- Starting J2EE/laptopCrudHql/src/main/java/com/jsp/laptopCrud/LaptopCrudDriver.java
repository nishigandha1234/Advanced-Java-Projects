package com.jsp.laptopCrud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.laptopCrud.entity.LaptopCrud;

public class LaptopCrudDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//1st operation insert operation
		
//		LaptopCrud l1 = new LaptopCrud();
//		l1.setName("Hp");
//		l1.setPrice(50000.00);
//		l1.setRam(256);
//		
//		LaptopCrud l2 = new LaptopCrud();
//		l2.setName("Lenovo");
//		l2.setPrice(70000.00);
//		l2.setRam(256);
//		
//		LaptopCrud l3 = new LaptopCrud();
//		l3.setName("Macbook");
//		l3.setPrice(100000.00);
//		l3.setRam(256);
//		
//		LaptopCrud l4 = new LaptopCrud();
//		l4.setName("Asus");
//		l4.setPrice(100000.00);
//		l4.setRam(128);
//		
//		et.begin();
//		em.persist(l1);
//		em.persist(l2);
//		em.persist(l3);
//		em.persist(l4);
//		et.commit();
		
//--------------------------------------------------------------------------------------
		
		//2nd operation select operation 
		
//		Query query = em.createQuery("from LaptopCrud");
//		List<LaptopCrud> rs = query.getResultList();
//		for (LaptopCrud laptopCrud : rs) {
//			System.out.println(laptopCrud);
//		}
//--------------------------------------------------------------------------------------	
		
		//3rd operation update operation 
		
		//1st using named parameter
//		et.begin();
//		Query q2 = em.createQuery("update LaptopCrud l set l.name = :myName where l.id = :myId");
//		q2.setParameter("myName", "Pavillion");
//		q2.setParameter("myId", 4);
//		int exu = q2.executeUpdate();
//		System.out.println("exu : " + exu);
//		et.commit();
		
		//2nd using positional parameter
//		et.begin();
//		Query q3 = em.createQuery("update LaptopCrud l set l.name = ?2 where l.id = ?1");
//		q3.setParameter(2,"Hp");
//		q3.setParameter(1, 5); // 1 is for id and 5 is for i want to change 5th id 
//		int ex = q3.executeUpdate();
//		System.out.println("ex : "+ex);
//		et.commit();
		
//-----------------------------------------------------------------------------------------
	//4th operation delete operation 
	
		//1st using named parameter
//		et.begin();
//		Query q = em.createQuery("delete from LaptopCrud l where l.id = :myId");
//		q.setParameter("myId", 7);
//		int ex = q.executeUpdate();
//		System.out.println("ex : "+ex);
//		et.commit();
		
		//2nd using Positional parameters
		et.begin();
		Query q2 = em.createQuery("delete from LaptopCrud l1 where l1.id = ?1");
		q2.setParameter(1,8);
		int ex = q2.executeUpdate();
		System.out.println("ex : "+ex);
		et.commit();
		
	}

}
