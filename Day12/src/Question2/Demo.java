package Question2;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Demo {
public boolean validate(String name, String mobileNum, String aadharCard,String email) {
	
		
		if((Pattern.matches("[789]{1}\\d{9}", mobileNum))
				&& (Pattern.matches("[a-zA-Z]{3,8}", name))
				&&(Pattern.matches("[0-9]{12}", aadharCard))
				&&(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email))) {
			
			return true;
			}else {
			
			return false;
		}
		
	}
	
    public static void main(String[] args) {
    	Citizen citizen=new Citizen();
		
    	Demo d=new Demo();
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter name");
    	String name=sc.nextLine();
    	citizen.setName(name);
    	
    	System.out.println("Enter Mobile number");
    	String mobile=sc.nextLine();
    	citizen.setMobileNumber(mobile);
    	
    	System.out.println("Enter aadhar number");
    	String aadhar=sc.nextLine();
    	citizen.setAadharNumber(aadhar);
    	
    	System.out.println("Enter E-Mail");
    	String ema=sc.nextLine();
    	citizen.setEmail(ema);
    	
    	boolean g=d.validate(name, mobile, aadhar,ema);
    	if(g) {
    		
			
		    System.out.println(" name is :"+citizen.getName());
		    System.out.println("Mobile Number is :"+citizen.getMobileNumber());
		    System.out.println("Aadhar Number is :"+citizen.getAadharNumber());
		    System.out.println("E-Mail is :"+citizen.getEmail());	    	
    	}else {
    		System.out.println("validation error .");
    	}
	}
    
    
    
}
