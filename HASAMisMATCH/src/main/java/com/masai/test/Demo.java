package com.masai.test;

import javax.persistence.EntityManager;

import com.masai.Util.DBUtil;
import com.masai.bean.Address;
import com.masai.bean.Employee;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em=DBUtil.ProvideEntityConnection();
		Employee emp=new Employee();
		emp.setName("Raj");
		emp.setGender("male");
		emp.setSalary(7800);
		
		emp.getEmpAddress().add(new Address("st1", "ct1","78754","home"));
		emp.getEmpAddress().add(new Address("st2", "ct2","58754","office"));
		emp.getEmpAddress().add(new Address("st3", "ct3","98754","Office"));
		emp.getEmpAddress().add(new Address("st4", "ct4","48754","Office"));
		
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		
				
		
         System.out.println("done");		
		
		

	}

}
