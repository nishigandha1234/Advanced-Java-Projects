package com.jsp.manytomanyunimap;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytomanyunimap.entity.Course;
import com.jsp.manytomanyunimap.entity.Stud;

public class StudentCourseDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		ArrayList<Course>a2= new ArrayList();
		
		Stud s = new Stud(01,"Nishigandha", 22,a2);
		Stud s1 = new Stud(02,"Sakshi",23,a2);
		Stud s2 = new Stud(03,"Vaishnavi",24,a2);
		
		ArrayList<Stud>a1= new ArrayList();
		a1.add(s);
		a1.add(s1);
		a1.add(s2);

		Course c = new Course(11, "Java Development", 0,"10 months",a1);
		Course c1 = new Course(12, "Python Development", 0,"15 months",a1);
		Course c2 = new Course(13, "SQL Development", 0,"5 months",a1);
		
		
		a2.add(c);
		a2.add(c1);
		a2.add(c2);
		
		et.begin();
		
		em.persist(s1);
		em.persist(s2);
		em.persist(c);
		em.persist(s);
		em.persist(c1);
		em.persist(c2);
		
		et.commit();
	}

}
