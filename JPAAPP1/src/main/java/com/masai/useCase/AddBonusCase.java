package com.masai.useCase;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class AddBonusCase {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			
			System.out.println("Enter Employee Bonus");
			int bonus=sc.nextInt();
			
			EmployeeDao dao=new EmployeeDaoImpl();
			
			String s=dao.giveBonusToEmployee(id, bonus);
			
			System.out.println(s);

	}


}
