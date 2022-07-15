package com.masai.useCase;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;
import com.masai.bean.Employee;

public class GetAllById {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			
			EmployeeDao dao=new EmployeeDaoImpl();
			
			List<Employee> e=dao.getAllEmployee(id);
			
			System.out.println(e);
			
	}
}
