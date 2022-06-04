package Question3;
import java.util.Scanner;
public class Ipl {

	public void homeTeamStadium(Stadium stadium) {
		
		if( stadium==stadium.EDEN_GARDENS_STADIUM){
			
			 System.out.println("This is the home ground of KKR");
		}
		else if(stadium==stadium.WANKHEDE_STADIUM) {
			
			System.out.println("This is the home ground of Mumbai Indians");
	    }
		else if(stadium==stadium.CHIDAMBARAM_STADIUM) {
			
	    	System.out.println("This is the home ground of CSK");
	    }
		else if(stadium==stadium.M_CHINNASWAMY_STADIUM) {
			
	    	System.out.println("This is the home ground of RCB");
	    }
			
				
	}
	public static void main(String[] args) {
		Ipl ipl=new Ipl();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Stadium name");
		String name=scanner.nextLine();
		
		
		Stadium stadiu=Stadium.valueOf(name);
		ipl.homeTeamStadium(stadiu);
		
	}

}
