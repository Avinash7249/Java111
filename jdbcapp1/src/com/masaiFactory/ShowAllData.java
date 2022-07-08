package com.masaiFactory;

public class ShowAllData {

	public static void main(String[] args) {
		StudentJDBCDAO student = new StudentJDBCDAO();
		student.findAll();

	}

}
