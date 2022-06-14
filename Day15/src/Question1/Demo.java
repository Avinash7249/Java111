package Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Question2.EmployeeBonus;

public class Demo {
	
	public static  int Age(String dateofbirth) throws InvalidDateFormat  {
		try {
		LocalDate d1 = LocalDate.parse(dateofbirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		
		LocalDate c1 = LocalDate.now();
		
		Period p = Period.between(d1,c1);
		
		
        if(d1.isAfter(c1)){
			
			System.out.println("Age should not be in the future");
			
		}
		
		return p.getYears();
		}
		catch(DateTimeParseException e) {
			InvalidDateFormat in=new InvalidDateFormat("Invalid Date Format");
			throw in;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter your date of birth in dd-MM-yyyy format");
			
			String dob = sc.next();
			
				
				
				try {
					double d=Demo.Age(dob);
					if(d>0) {
						System.out.println(d);
					}
					
				} catch (DateTimeParseException | InvalidDateFormat e) {
					System.out.println(e.getMessage());
					
				}
				
			
			
			
		
		
		
		


	}

}
