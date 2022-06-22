package Question2;

public class ThreadA implements Runnable{

	@Override
	public synchronized void run() {
		
		System.out.print("Welcome");
//		try{
//		Thread.sleep(1000);
//		}
//		catch(Exception ee){
//		}
		System.out.println("name");
		
		
	}

}
