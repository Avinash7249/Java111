package com.masai.Dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.masai.bean.Employee;
import com.masai.util.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean deleteEmployee(int empId) {
		
		boolean msg=true;
		
        EntityManager em=DBUtil.ProvideConnection();
		
		Employee employee=em.find(Employee.class, empId);
		
        if(employee!=null) {
        	
        	em.getTransaction().begin();
        	
        	em.remove(employee);
        	
        	em.getTransaction().commit();
        }
        else {
        	
        	msg=false;
        }
		
		em.close();
		
		return msg;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String msg="Not found";
		
       
		
        EntityManager em=DBUtil.ProvideConnection();
		
		Employee employee=em.find(Employee.class, empId);
		
        msg=employee.getAddress();
		
		em.close();
		
		return msg;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		
		String [] s=new String[2];
		
		EntityManager em=DBUtil.ProvideConnection();
		
		Employee employee=em.find(Employee.class, empId);
		
        
        s[0]=employee.getName();
        s[1]=employee.getAddress();
		
		em.close();
		
		
		
		return s;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		
		String message="Not Updated";
		
		EntityManager em=DBUtil.ProvideConnection();
		
		Employee emp=new Employee();
		
		emp=em.find(Employee.class,empId);
		
		em.getTransaction().begin();
		
		if(emp!=null) {
			
			emp.setSalary(emp.getSalary()+bonus);
			message="Updated";
			
		}
		
		em.getTransaction().commit();
		
		return message;
	}

	@Override
	public List<Employee> getAllEmployee(int empId) {
		
		List<Employee> emp=new ArrayList();
		
		EntityManager em=DBUtil.ProvideConnection();
		
		Employee employee=em.find(Employee.class, empId);
		
		em.getTransaction().begin();
		
		if(emp!=null) {
			
			emp.add(employee);
			
		}
		
		em.getTransaction().commit();
		
		return emp;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		
		
		List<Employee> emp=new ArrayList<>();
		
		EntityManager entityManager=DBUtil.ProvideConnection();
		
		Query w=entityManager.createQuery("from Employee");
		
		emp=w.getResultList();
		
		entityManager.close();
		
		return emp;
	}


}

