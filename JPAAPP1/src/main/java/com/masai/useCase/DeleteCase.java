package com.masai.useCase;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class DeleteCase {

	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			
			EmployeeDao dao=new EmployeeDaoImpl();
			boolean d= dao.deleteEmployee(id);
			
			System.out.println(d);

		}

}
