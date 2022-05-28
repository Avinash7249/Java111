package question2;
import java.util.*;
class Child extends Parent{
     @Override
	void method1() {
		System.out.println("Inside Child Mefhod1"+number);
	}
     
     void method4() {
 		System.out.println("Inside Child Mefhod4");
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Child child=new Child();
		Parent parent=child;
		
		System.out.println("Enter a Number between 1 to 10");
		int num=sc.nextInt();
		if(num>0 &&num<10) {
		child.number=num;
		
		
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
