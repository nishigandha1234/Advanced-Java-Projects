package com.jsp.studcrud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.studcrud.entity.StudentCrud;

public class StudentUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		StudentCrud s1 = new StudentCrud(101,"Gayatri", "21-2-2011", 827621723, 972272382);
		StudentCrud s2 = new StudentCrud(102,"Yash","12-03-2005", 1267678212,1526251561);
		StudentCrud s3 = new StudentCrud(103,"Yashaswi","7-04-2009", 343678212,123251561);
		
		et.begin();
		
		StudentCrud studentCrud = em.find(StudentCrud.class, 102);
		studentCrud.setMobile(238234731);
		studentCrud.setStudDOB("24-02-2019");
		em.merge(studentCrud);
		
		et.commit();
	}

}
