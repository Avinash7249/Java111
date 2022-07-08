package com.masaiFactory;

public class FindSalasy {

	public static void main(String[] args) {
		StudentJDBCDAO student = new StudentJDBCDAO();
		student.findAllSalary(80000);

	}

}
