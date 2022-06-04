package Question3;

abstract public class Demo {

	
	public abstract void  fun();//abstract method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Child extends Demo{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}
	
}
//Explain abstract class and interface with an example.
//the classs which is defined as abstract is called abstract class.
//Abstract class has doesn;t any meaning before extending another child class.
//The empty abstract class is valid.
//an abstract class have may or may not as abstract method other than this other things as it is 
// main mathod ,method etc;
//the child class should be override the parent method or make as class as abstract.
//we can not create object directly of abstract class.