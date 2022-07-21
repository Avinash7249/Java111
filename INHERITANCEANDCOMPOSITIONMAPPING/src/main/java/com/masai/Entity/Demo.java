package com.masai.Entity;

import javax.persistence.EntityManager;


import com.masai.util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideConnection();
		
		Address ad2 = new Address("st1", "ct1","78754");
		Address ad3=new Address("st2", "ct2","58754");
		Address ad4 = new Address("st3", "ct3","98754");
		
		
		Employee e1=new Employee();
		
		e1.setHomeAddress(ad2);
		e1.setName("Avinash");
		e1.setSalary(12000);
		e1.setOfficeAddress(ad3);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		
		System.out.println("done");

	}

}
