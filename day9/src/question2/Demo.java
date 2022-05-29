package question2;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number between 1 to 10");
		int num=sc.nextInt();
		if(num>0 &&num<10) {
			Child child=new Child(num);
			Parent parent=child;
		
		
		
		parent.method1();
		parent.method2();
		parent.method3();
		child.method4();
		}
		else {
			System.out.println("Please Re-enter the Number between 1 to 10");
		}
	}

}
