package Question3;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
       Car c=new Car();
		Scanner scanner = new Scanner(System.in);

		//Write logic to get numberOfPassenger and numberOfKms
		System.out.println("number of passengers");
		int numberOfPassenger=scanner.nextInt();
		c.setNumberOfPassenger(numberOfPassenger);
		
		System.out.println("number of Kilometers");
		int numberOfKms=scanner.nextInt();
		c.setNumberOfKms(numberOfKms);

		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);
		}
}
