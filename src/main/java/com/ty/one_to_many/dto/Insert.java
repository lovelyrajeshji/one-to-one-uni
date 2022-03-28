package com.ty.one_to_many.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		
	

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Mobile m = new Mobile();
	  m.setName("Nokia");
	  m.setCost(300);
	  
	Sim s1 = new Sim();
	
	s1.setSimType("4g");
	s1.setSimProvider("idea");
	s1.setMobile(m);
	
   Sim s2 = new Sim();
	
	s1.setSimType("6g");
	s1.setSimProvider("airtel");
	s1.setMobile(m);
	et.begin();
	em.persist(s1);
    em.persist(s2);
    em.persist(m);
    et.commit();
    System.out.println("oky");
}
}