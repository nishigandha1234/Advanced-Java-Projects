package com.jsp.assignmentmapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.assignmentmapping.entity.Doctors;
import com.jsp.assignmentmapping.entity.Hospitals;
import com.jsp.assignmentmapping.entity.Organization;
import com.jsp.assignmentmapping.entity.Students;

public class StudentsOrganizationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Organization o1 = new Organization(10, "Vikhe Patil", "A.Nagar", 1998);
		Students s1 = new Students(21, "Naman", "BE", "E&TC", o1);
		Students s2 = new Students(22, "Kamala", "BTech", "CS", o1);
		Students s3 = new Students(203, "Namata", "BSC", "IT", o1);
		
		et.begin();
		em.persist(o1);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
	}

}

