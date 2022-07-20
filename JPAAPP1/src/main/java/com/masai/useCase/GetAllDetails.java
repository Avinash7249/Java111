package com.masai.useCase;

import java.util.List;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.bean.Employee;

public class GetAllDetails {

	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		List<Employee> emp=dao.getAllEmployeeDetails();
		
		for(Employee e:emp)
		
		System.out.println(e);
		

	}

}
