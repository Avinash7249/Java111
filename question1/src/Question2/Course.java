package Question2;
import java.util.Scanner;
public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	
	static void authenticate(String username,String password) {
		if(username=="Admin"&&password=="1234") {
			Scanner scanner=new Scanner(System.in);
			Course c=new Course();
			
			System.out.println("Enter id");
			int id=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter name");
			String name=scanner.nextLine();
			
			
			System.out.println("Enter course fee");
			int fee=scanner.nextInt();
			
			c.courseId=id;
			c.courseName=name;
			c.courseFee=fee;
			c.displayCourseDetails();
			
			
		}else {
			System.out.println("Invalid Username or password");
		}
	}
	public void displayCourseDetails() {
		System.out.println("courseId is :"+courseId);
		System.out.println("course Name is :"+courseName);
		System.out.println("course Fee is :"+courseFee);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Course.authenticate("Admin", "1234");
Course.authenticate("ad","45");
	}

}
