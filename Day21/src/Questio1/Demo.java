package Questio1;

// if thread A is reading data from the linked list and another thread B is trying to delete the
//same data.This process leads to a race condition that may result in run time error.
//or we can't get required output then we should use synchronized block or method.

public class Demo {

	public static void main(String[] args) {


		ThreadA a1=new ThreadA();
		
		Thread t1=new Thread(a1);
		
		Thread t2=new Thread(a1);
		System.out.println("start of main");
		
		t1.start();
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		t2.start();
		
		System.out.println("end of main");
		
	}

}
