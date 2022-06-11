package Question1;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			
			System.out.println("Enter product Id");
			int id=sc.nextInt();
			
			System.out.println("Enter product Name");
			String name=sc.next();
			
			System.out.println("Enter product Price");
			double price=sc.nextDouble();
			
			Product product = new Product(id,name,price);
			products.add(product);

			
		}
		
		System.out.println("Enter  the choice");
		
		System.out.println("1 for sorting the product according to the productPrice");
		
		System.out.println("2 for sorting the product according to the productName");
		
		System.out.println("3 for sorting the product according to the productId");
		
		int choice=sc.nextInt();
		
		if(choice==1) {
			
		}
		

	}

}
