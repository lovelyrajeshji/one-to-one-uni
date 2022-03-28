package com.ty.onetoone.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertAddreas_Branch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction() ;   
		Branch b = new Branch();
		b.setName("Rajesh yadav");
		b.setPhone(80194208l);
		
		Addreas a  = new Addreas();
		a.setArea("rjn");
		a.setPin(2345);
		a.setState("karanataka");
		b.setAddreas(a);
		
		et.begin();
		em.persist(a);
		em.persist(b);
		et.commit();
		System.out.println("inserted==========sucessfully");
		

	}

}
