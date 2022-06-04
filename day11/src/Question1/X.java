package Question1;

public interface X {

	
	void Eat();
	
	default void  play() {
		System.out.println("interface x default method");
	}
	
	public static void run() {
		System.out.println("interface x static method");
	}
}
