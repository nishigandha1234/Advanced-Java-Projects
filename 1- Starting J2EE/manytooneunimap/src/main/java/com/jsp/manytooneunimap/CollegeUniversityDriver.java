package com.jsp.manytooneunimap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytooneunimap.entity.College;
import com.jsp.manytooneunimap.entity.University;

public class CollegeUniversityDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		University u1 = new University(201, "SPPU", "Pune", "012HSD");
		College c1 = new College(01, "DVVPCOE A.Nagar", "AhilyaNagar", 150, u1);
		College c2 = new College(02, "D Y Patil", "Pune", 200, u1);
		
		et.begin();
		em.persist(u1);
		em.persist(c1);
		em.persist(c2);
		et.commit();
		
		  System.out.println("✅ Many-to-One Unidirectional Data Saved Successfully!");
	}

}
