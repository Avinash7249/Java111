package Question3;

public class Demo {
	
	public static void main(String[] args) {
		final int d=0;
		try {
			System.out.println("Inside try");
			
			System.out.println(100/0);
			
		}catch(Exception s){
			System.out.println("Inside catch..");
		}
		finally {
			System.out.println("Inside finally..");
		}
	}

}
//Explain Finally and Final Keyword with an Example?

//the Finally block is used along with try and catch we can't use alone,the finally block 
//it has a block but final there is no such block exicutation of statement.
//the finally block is always going to execute unless we forcefully terminate the program.

//the final keyword is used to declare a final variable ,the variable we do not assign value again,while 
//define the variable at time only we have assigned the value.
