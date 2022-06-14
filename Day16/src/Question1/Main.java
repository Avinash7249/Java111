package Question1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		try {
		for(int i=0;i<4;i++) {
			
			System.out.println("Enter product Id");
			int id=sc.nextInt();
			
			System.out.println("Enter product Name");
			String name=sc.next();
			
			System.out.println("Enter product Price");
			double price=sc.nextDouble();
			

			products.add(new Product(id,name,price));

			
		}
		System.out.println(products);
		
		System.out.println("Enter  the choice");
		
		System.out.println("1 for sorting the product according to the product Price");
		
		System.out.println("2 for sorting the product according to the product Name");
		
		System.out.println("3 for sorting the product according to the product Id");
		
		int choice=sc.nextInt();
		
		if(choice==1) {
			

			Collections.sort(products,new SortProductPrice());
			System.out.println(products);

			
		}
		else if(choice==2) {
        
        Collections.sort(products,new SortProductName());
		System.out.println(products);
			
		}
		else if(choice==3) {
			Collections.sort(products,new SortProductId());
			System.out.println(products);
				
			}
		else {
			System.out.println(products);
		}
		}
		catch(Exception e) {
			System.out.println("Enter correct information");
		}

	}

}
