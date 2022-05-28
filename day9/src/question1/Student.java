package question1;
import java.util.*;
public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	};
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + 
	grade + "]";
	}
	public void displayDetails() {
		
		Scanner sc=new Scanner(System.in);
		
		Student student=new Student();
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		student.setName(name);
		
		System.out.println("Enter Roll Number");
		int roll=sc.nextInt();
		student.setRoll(roll);
		
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		student.setMarks(marks);
		
		
		
		
		System.out.println("student Name :"+student.getName());
		System.out.println("student Roll Number :"+student.getRoll());
		System.out.println("student Marks :"+student.getMarks());
		System.out.println("student Grade :"+student.calculateGrade());
		
	};
	private char calculateGrade() {
		int marks=getMarks();
		
		if( marks >=500) {
			return  65;
		}
		else if (marks < 500 &&marks >=400) {
			return 67;
		}
		else if( marks <400 ) {
			return 68;
		}
		return grade;
		
		
	}
	

}
