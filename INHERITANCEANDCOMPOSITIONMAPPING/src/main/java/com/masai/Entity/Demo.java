package com.masai.Entity;

import javax.persistence.EntityManager;


import com.masai.util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideConnection();
		Address ad1 = new Address("st1", "ct1","78756");
		Address ad2 = new Address("st2", "ct2","78754");
		Address ad3=new Address("st3", "ct4","58754");
		Address ad4 = new Address("st4", "ct4","98754");
		
		
		Employee e1=new Employee();
		
		e1.setHomeAddress(ad2);
		e1.setName("Avinash");
		e1.setSalary(12000);
		e1.setOfficeAddress(ad2);
		
		Employee e2=new Employee();
		e2.setHomeAddress(ad3);
		e2.setOfficeAddress(ad3);
		e2.setName("Raj");
		e2.setSalary(30000);
		
		Employee e3=new Employee();
		e3.setHomeAddress(ad4);
		e3.setOfficeAddress(ad4);
		e3.setName("Raghv");
		e3.setSalary(40000);
		
		
		
		Employee e4=new Employee();
		e4.setHomeAddress(ad1);
		e4.setOfficeAddress(ad1);
		e4.setName("Rajashree");
		e4.setSalary(33000);
		
		
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.getTransaction().commit();
		
		System.out.println("done");

	}

}
