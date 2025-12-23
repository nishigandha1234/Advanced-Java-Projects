package com.jsp.onetomanybimap;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomanybimap.entity.College;
import com.jsp.onetomanybimap.entity.Student;

public class StudentCollegeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		College c1 = new College();
		c1.setCid(101);
		c1.setName("DVVPCOE");
		c1.setLoc("Pune");
		
		Student s1 = new Student();
		s1.setSid(201);
		s1.setName("Sandip");
		s1.setAge(23);
		s1.setGender("Male");
		s1.setCollege(c1);
		
		Student s2 = new Student();
		s2.setSid(202);
		s2.setName("Yash");
		s2.setAge(32);
		s2.setGender("Male");
		s2.setCollege(c1);
		
		Student s3 = new Student();
		s3.setSid(203);
		s3.setName("Narayan");
		s3.setAge(24);
		s3.setGender("Male");
		s3.setCollege(c1);
		
		ArrayList<Student> a1 =new ArrayList();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		c1.setStudent(a1);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(c1);
		et.commit();
	}

}
