package Question4;
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Student s=new Student();
		
		System.out.println("Enter Number of Students you want to enter");
		int id=scanner.nextInt();
		
		for(int i=0;i<id;i++) {
			
			System.out.println("Enter Roll Number of Students ");
			int roll=scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Enter name");
			String name=scanner.nextLine();
			
			System.out.println("Enter the marks ");
			int mark=scanner.nextInt();
			
			s.Student(roll, name, mark);
		}
		
		System.out.println(s.getRollNumber());
		System.out.println(s.getStudentName());
		System.out.println(s.getMarks());
		
	}
	

}
