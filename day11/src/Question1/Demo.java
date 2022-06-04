package Question1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		X x=new ZImpl();
		Y y=new ZImpl();
		
		x.Eat();
		X.run();
		x.play();
		y.fun1();
		y.fun2();
		Y.fun3();
		
		ZImpl imp=(ZImpl)x;
		imp.fun2();
		imp.Eat();
		imp.funZ();
		imp.play();
		
		
	}

}
