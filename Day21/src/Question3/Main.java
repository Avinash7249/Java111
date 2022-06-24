package Question3;

public class Main {

	public static void main(String[] args) {
		
			Common c=new Common();
			
			Thread t1=new Thread(c);
			Thread t2=new Thread(c);
			
			t1.start();
			t2.start();
	}

}
