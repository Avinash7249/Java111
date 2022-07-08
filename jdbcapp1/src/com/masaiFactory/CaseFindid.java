package com.masaiFactory;

public class CaseFindid {

	public static void main(String[] args) {
		StudentJDBCDAO student = new StudentJDBCDAO();
		student.findAllbyeid(10);
	}

}
