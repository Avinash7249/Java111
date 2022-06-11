package Question2;

import java.util.ArrayList;
import java.util.Scanner;

import Question1.Product;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			
			System.out.println("Enter Employee Name");
			String name=sc.next();
			
			System.out.println("Enter Employee salary");
			double salary=sc.nextDouble();
			
			Employee Employee = new Employee(id,name,salary);
			employees.add(Employee);

			
		}
	}

}
