package Question2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
		

			
			System.out.println("Enter Name");
			String name=sc.nextLine();
			
			//sc.nextLine();
			System.out.println("Enter Address");
			String address=sc.nextLine();
			
			System.out.println("Enter phisics Marks");
			int phy=sc.nextInt();
			
			System.out.println("Enter chemistry Marks ");
			int chem=sc.nextInt();
			
			System.out.println("Enter maths Marks");
			int maths=sc.nextInt();
			
			ScienceStudent science=new ScienceStudent(name,address,phy,chem,maths);
			System.out.println(science.getPercentage());
			
			System.out.println("Enter Name");
			String name1=sc.nextLine();
			
			//sc.nextLine();
			System.out.println("Enter Address");
			String address1=sc.nextLine();

			
			System.out.println("Enter history Marks");
			int history=sc.nextInt();
			
			System.out.println("Enter civics Marks");
			int civics=sc.nextInt();
		
		
		
		
		
		
		
		HistoryStudent history1=new HistoryStudent(name1,address1,history,civics);
		
		
		
			System.out.println(history1.getPercentage());

	}

}
