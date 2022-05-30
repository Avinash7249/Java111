package question1;

import java.util.Scanner;

 public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		student.setName(name);
		
		System.out.println("Enter Roll Number");
		int roll=sc.nextInt();
		student.setRoll(roll);
		
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		student.setMarks(marks);
		//Student student=new Student(name,roll,marks);
		
      student.displayDetails(student);
      //System.out.println(student);
      
	}

}
