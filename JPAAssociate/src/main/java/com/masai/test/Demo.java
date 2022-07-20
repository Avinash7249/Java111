package com.masai.test;

import javax.persistence.EntityManager;

import com.masai.Util.DBUtil;
import com.masai.bean.Department;
import com.masai.bean.Employee;

public class Demo {

	public static void main(String[] args) {
		
		
		EntityManager em=DBUtil.ProvideEntityConnection();
		
		
		Department dept=new Department();
		dept.setDname("sales");
		dept.setLocation("pune");
		
		Employee emp1=new Employee();
		emp1.setEname("Ram");
		emp1.setSalary(6800);
		emp1.setAddress("solapur");
		emp1.setDept(dept); 
		
		Employee emp2=new Employee();
		emp2.setEname("Raghu");
		emp2.setSalary(8400);
		emp2.setAddress("pune");
		emp2.setDept(dept); 
		
		
		Employee emp3=new Employee();
		emp3.setEname("Shahu");
		emp3.setSalary(8900);
		emp3.setAddress("nagpur");
		emp3.setDept(dept); 
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		dept.getEmps().add(emp3);
		
		em.getTransaction().begin();
		
		em.persist(dept);
		
		em.getTransaction().commit();	
			
		System.out.println("done...");
		
		}

	

}
