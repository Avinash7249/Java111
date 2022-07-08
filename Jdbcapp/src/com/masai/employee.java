package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		
		System.out.println("Enter address");
		String add=sc.next();
		
		
		
		System.out.println("Enter salary");
		int sal=sc.nextInt();
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String sc1="jdbc:mysql://localhost:3306/sb101db";
		try(Connection con=DriverManager.getConnection(sc1, "root", "root")) {
			
//			String s="create table emp2"
//					
//			+ "("
//            + " eid int primary key,"
//            + " name varchar(15),"
//            + " address varchar(15),"
//            + " salary int"
//            + ")";
//			PreparedStatement pst=con.prepareStatement("insert into employee(eid,name,salary) values(?,?,?)");
//		    pst.setInt(1, 10);
//		    pst.setString(2, "pinku");
//		    pst.setInt(3, 100000);			
			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2,name);
			pst.setString(3, add);
			pst.setInt(4,sal);
//			PreparedStatement pst=con.prepareStatement("select *  from employee where eid=?");			
//			PreparedStatement pst=con.prepareStatement("select *  from employee");	
//			PreparedStatement pst=con.prepareStatement("update employee set salary =salary+500");
//			PreparedStatement pst=con.prepareStatement("select * from employee where salary>8000");
//			PreparedStatement pst=con.prepareStatement("update employee set salary =salary+500");
//			pst.setInt(1, id);
//			
//			ResultSet rs=pst.executeQuery();
			
			//System.out.println(rs.getInt("ss"));
			
			
           int d=pst.executeUpdate();
           
           
			
			if(d>0) {
				System.out.println("added");
			}
			else {
				System.out.println("no");
			}
			
			
//			
//			while(rs.next()){
//					
//					System.out.println("Employee id  :"+rs.getInt("eid")+" ,"+
//					"Employee Name  :"+rs.getString("name")+","+
//					"Employee Address  :"+ rs.getString("address")+","+
//					"Employee salary  :"+rs.getInt("salary"));
//				}
//			
//			
//			rs.close();
			
			

			
			
			
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
