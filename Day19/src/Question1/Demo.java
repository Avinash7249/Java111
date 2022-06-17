package Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List <City> city =new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter city name");
			String name=sc.nextLine();
			city .add(new City(name));
			
		}
		
		Collections.sort(city,(s1,s2)->s2.getCity().compareTo(s1.getCity()));
		
		System.out.println(city);
		
		

	}

}
