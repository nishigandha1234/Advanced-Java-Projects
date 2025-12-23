package com.jsp.hql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hql.entity.Student;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Student s1= new Student();
//		s1.setAge(26);
//		s1.setName("Rahul");
//		
//		Student s2= new Student();
//		s2.setAge(21);
//		s2.setName("Ram");
//		
//		Student s3= new Student();
//		s3.setAge(23);
//		s3.setName("Rachita");
//		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);
//		et.commit();
		
//		Query query = em.createQuery("from Student");
//		List<Student> rs = query.getResultList();			
//		for (Student student : rs) {
//			System.out.println(student);
//		}
		
//		Query query = em.createQuery("from Student s where s.id = :myNewId"); // named parameter
//		//query.setParameter("myId", 1);
//		query.setParameter("myNewId", 2);
//		
//		List<Student> rs = query.getResultList();
//		System.out.println(rs);
		
//		Object obj = query.getSingleResult();
//		Student s = (Student)obj; //return type is object and we need only child class properties so its downcasted
//		System.out.println(s);  //This is optional for getResultList and we used this when it'll only one object.
		
//		Query q = em.createQuery("from Student s where s.id = ?1");
//		//query.setParameter("myId", 1);
//		q.setParameter(1,1);
//		
//		List<Student> rs = q.getResultList();
//		System.out.println(rs);
//		
		
//--------------------------------------------------------------
		
		//update
	
		
		//named parameter
//		et.begin();
//		Query query = em.createQuery("update Student s set s.name = :myName where s.id = :myId");
//		query.setParameter("myName", "Tanishka");
//		query.setParameter("myId", 2);
//		
//		int ex = query.executeUpdate();
//		System.out.println(" ex : " + ex);
//		et.commit();
		
		
		//positional parameter
//		et.begin();
//		Query query = em.createQuery("update Student s set s.name = ?2 where s.id = ?1");
//		query.setParameter(2, "Yash"); 
//		query.setParameter(1, 2); 
//		
//		int ex = query.executeUpdate();
//		System.out.println(" ex : " + ex);
//		et.commit();
//		
		
		//delete 
		et.begin();
		Query query = em.createQuery("delete from Student s where s.id = :myId");
		query.setParameter("myId", 1);
		
		int ex = query.executeUpdate();
		System.out.println(" ex : " + ex);
		et.commit();
		
	}
}
