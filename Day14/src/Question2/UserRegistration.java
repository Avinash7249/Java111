package Question2;

import java.util.Scanner;

public class UserRegistration {
	
	public void registerUser(String username,String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}else {
			
			
			InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}

	public static void main(String[] args) {
		
		UserRegistration ur=new UserRegistration();
		
        Scanner sc=new Scanner(System.in);
        try {
        System.out.println("Enter Your Name:");
        String name=sc.nextLine();
       
        System.out.println("Enter Your Country:");
        String country=sc.nextLine();
        
		
			ur.registerUser(name, country);
		} catch (InvalidCountryException e) {
			 System.out.println(e.getMessage());
			
		}
		
	}

}
