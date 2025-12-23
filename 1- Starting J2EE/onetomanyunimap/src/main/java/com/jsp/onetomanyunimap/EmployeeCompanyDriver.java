package com.jsp.onetomanyunimap;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomanyunimap.entity.Company;
import com.jsp.onetomanyunimap.entity.Employee;

public class EmployeeCompanyDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Employee e1 = new Employee(10,"Nishigandha",1000000);
		Employee e2 = new Employee(11, "Yadnyenesh",200000);
		
		ArrayList<Employee>a1= new ArrayList();
		a1.add(e1);
		a1.add(e2);
		
		Company c = new Company(20, "Yardi", "Pune",a1);
		
		et.begin();
		
		em.persist(e1);
		em.persist(e2);
		em.persist(c);
		
		et.commit();
	}

}
