package Question1;
import java.util.*;
public class Demo {

	public Hotel provideFood(int amount) {
		
		if(amount>1000) {

			return new TajHotel();
		}else if(amount<1000 &&amount>200) {

			return new RoadSideHotel();
		}else {
			
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter amount");
    int am=sc.nextInt();
    Demo d=new Demo();
   Hotel hotel= d.provideFood(am);
   
   if(hotel!=null) {
	   hotel.chickenBiryani();
	   hotel.masalaDosa();
	   if( hotel instanceof TajHotel) {
	   TajHotel taj=  (TajHotel)hotel;
	   taj.welcomeDrink();
	   }
	   
   }else {
	   System.out.println("Enter valid amount");
   }
	}

}
