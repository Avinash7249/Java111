package Question3;

public class Common {
	
	public void fun1(String name){
		
	synchronized(A.class){
		
	System.out.print("Welcome :");
	
	try {
		
	Thread.sleep(1000);
	
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	System.out.println(name);
	}
	}
}