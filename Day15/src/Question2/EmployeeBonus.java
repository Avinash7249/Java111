package Question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EmployeeBonus {
	
	
	public static double Bonus(String bonus) throws   InvalidAgeException {
		
		LocalDate d1 = LocalDate.parse(bonus, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate c1 = LocalDate.now();
		Period p = Period.between(d1,c1);
		
		if(p.getYears() < 1) {
			
		return 5000 ;
		
		}
		else if(p.getYears()>=1&&p.getYears()<2) {
			
			return 8000 ;
		
		}
		else if(p.getYears()>2) {
			return 10000 ;
		}else {
			
			InvalidAgeException InvalidAgeException1=new InvalidAgeException("Please pass the date in the correct format");
			throw InvalidAgeException1;
		}
		
		
	}

	public static void main(String[] args) throws InvalidAgeException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your date of birth in dd-MM-yyyy format");
		
		String joiningd = sc.next();
		try {
		LocalDate d1 = LocalDate.parse(joiningd, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		LocalDate c1 = LocalDate.now();
		
		if(d1.isAfter(c1)){
			
			System.out.println("Age should not be in the future");
			
		}else {
			double d=EmployeeBonus.Bonus(joiningd);
			
			System.out.println("The bonus is "+ d);
		}
		}
		catch(DateTimeParseException e) {
			System.out.println("Invalid format");
		}

	}

}
