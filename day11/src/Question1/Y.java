package Question1;

public interface Y {

	
void fun1();
	
	default void  fun2() {
		System.out.println("interface y default method");
	}
	
	public static void fun3() {
		System.out.println("interface y static method");
	}
}
