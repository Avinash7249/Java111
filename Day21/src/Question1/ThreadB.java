package Question1;

public class ThreadB implements Runnable {

	int product=1;
	
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			product=product*i;
		}
	}
	
    

}
    
    
