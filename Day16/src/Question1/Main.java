package Question1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		TreeSet<Product> products1 = null;
		
		try {
		for(int i=0;i<2;i++) {
			
			System.out.println("Enter product Id");
			int id=sc.nextInt();
			
			System.out.println("Enter product Name");
			String name=sc.next();
			
			System.out.println("Enter product Price");
			int price=sc.nextInt();
			
			
			products.add(new Product(id,name,price));

			
		}
		
		System.out.println(products);
		
		System.out.println("Enter  the choice");
		
		System.out.println("1 for sorting the product according to the product Price");
		
		System.out.println("2 for sorting the product according to the product Name");
		
		System.out.println("3 for sorting the product according to the product Id");
		
		int choice=sc.nextInt();
		
		if(choice==1) {
			
			 products1 =new TreeSet<Product> (new SortProductPrice()); 
			 for(Product p:products) {
					products1.add(p);
				}
			//Collections.sort(products,new SortProductPrice());
			
			System.out.println(products1);

			
		}
		else if(choice==2) {
			 products1 =new TreeSet<Product> (new SortProductName()); 
			 for(Product p:products) {
					products1.add(p);
				}
        //Collections.sort(products,new SortProductName());
			
		System.out.println(products1);
			
		}
		else if(choice==3) {
			products1 =new TreeSet<Product> (new SortProductId());
			for(Product p:products) {
				products1.add(p);
			}
			//Collections.sort(products,new SortProductId());
			
			System.out.println(products1);
				
			}
		
		
		
		}
		catch(Exception e) {
			System.out.println("Enter correct information");
		}

	}

}
