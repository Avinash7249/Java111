package Question3;

public class Common implements Runnable{
	
	public void fun1(){
		A a=new A();
	synchronized(A.class){
		
	System.out.println("Welcome :");
	
	
	System.out.println("name");
	}
	}

	@Override
	public void run() {
		fun1();
		
	}
}