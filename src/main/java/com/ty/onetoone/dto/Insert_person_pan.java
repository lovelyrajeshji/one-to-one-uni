package com.ty.onetoone.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert_person_pan {
	
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person p = new Person();
	p.setName("praveen");
	p.setPhno(789878899l);
	p.setGender("male");
	
	Pan p1 = new Pan();
	p1.setPanNo("DVD7795007");
	p1.setDate("21-02-22");
	p1.setCountry("India");
	
	p1.setPerson(p);
	
	et.begin();
	em.persist(p1);
	em.persist(p);
	et.commit();
	System.out.println("done");
	

}
}