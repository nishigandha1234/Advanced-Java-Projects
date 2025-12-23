package com.jsp.assignmentmapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.assignmentmapping.entity.Doctors;
import com.jsp.assignmentmapping.entity.Hospitals;

public class DoctorsHospitalsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospitals h1 = new Hospitals(101, "Nayan", "AhilyaNagar", "WomensSpecialist");
		Doctors d1 = new Doctors(201, "Dr Chandrashekhar Kedar", "Heart", "MBBS", h1);
		Doctors d2 = new Doctors(202, "Nayan Kumar", "Brain", "BHMS", h1);
		
		et.begin();
		em.persist(d1);
		em.persist(d2);
		em.persist(h1);
		et.commit();
	}

}
