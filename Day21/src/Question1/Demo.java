package Question1;

public class Demo {

public static void main(String[] args) throws InterruptedException {
		
		ThreadB b=new ThreadB();
		
		Thread t1=new Thread(b);
		
		t1.start();
		
		t1.join();
		
		int s=b.product;
		
		System.out.println(s);
    }
}
