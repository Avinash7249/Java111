package com.masai.useCase;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class GetNameAddress {

	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			
			EmployeeDao dao=new EmployeeDaoImpl();
			
					
			String [] s=dao.getNameAndAddress(id);
			for(int i=0;i<2;i++) {
			System.out.println(s[i]);
			}

		}
}
