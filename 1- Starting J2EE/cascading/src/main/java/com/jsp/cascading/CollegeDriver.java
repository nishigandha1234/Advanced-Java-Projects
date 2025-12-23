package com.jsp.cascading;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CollegeDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		College c1 = new College();
		c1.setName("MIT College");
		c1.setAddress("Pune");
		c1.setUniversity("Pune University");
		
		Student s1 = new Student();
		s1.setName("Yadnyesh");
		s1.setEmail("yadnyeshdhangar@gmail.com");
		s1.setAddress("Jalgaon");
		
		Student s2 = new Student();
		s2.setName("Nishigandha");
		s2.setEmail("nishigandhakakade@gmail.com");
		s2.setAddress("Ahilyanagar");
		
		   // Link students to college
        List<Student> student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        c1.setStudent(student);
        
		et.begin();
		em.persist(c1); //automatically student objects will be saved 
		et.commit();
	
        System.out.println("College and Students saved successfully!");
	}
}
