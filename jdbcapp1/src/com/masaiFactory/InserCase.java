package com.masaiFactory;

public class InserCase {

	public static void main(String[] args) {
		StudentJDBCDAO student = new StudentJDBCDAO();
		Employee alok = new Employee();
		
		alok.setName("Alok");
		alok.setEid(8);
		alok.setSalary(90000);
		alok.setAddress("Ranchi");
		student.add(alok);
		
		
		
		
		Employee tinkoo = new Employee();
		tinkoo.setName("Arvind");
		tinkoo.setEid(6);
        tinkoo.setSalary(80000);
		student.add2(tinkoo);

		}
	
	

	

}
