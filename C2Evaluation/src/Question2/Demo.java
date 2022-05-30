package Question2;
import java.util.Scanner;
public class Demo {
	
	
	
	public int calculateAvrage(Student[] student) {
		int sum=0;
		for(int i=0;i<student.length;i++) {
			sum+=student[i].getMarks();
		}
		int ave=sum/student.length;
		return ave;
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Student objects need to be created.");
		 int nostudent=sc.nextInt();
		 
		Student[] student=new Student[nostudent];
		
		for(int i=0;i<nostudent;i++) {
			
			System.out.println("Enter Roll No");
			int rollno=sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Name");
			String name=sc.nextLine();
			
			sc.nextLine();
			System.out.println("Enter Address");
			String address=sc.nextLine();
			
			System.out.println("Enter Marks");
			int mark=sc.nextInt();
			
			student[i]=new Student(rollno,name,address,mark);
			
			}
		Demo d=new Demo();
		
		for(Student studen:student) {
			
			System.out.println("roll no :"+ studen.getRollNo());
			System.out.println("Name is :"+ studen.getName());
			System.out.println("Address is : "+ studen.getAddress());
			System.out.println("Mark :"+ studen.getMarks());
			System.out.println("Average is :"+ d.calculateAvrage( student));
			
		}

	}

}
