package Question3;


public class Main {
    
	
	public static void main(String[] args) {
		Car c=new Car();
		Engine e=new Engine(1444,12,"abs");
		e.hasturbo(true);
		e.displayCourseDetails();
		c.setColor("red");
		c.setcompanyName("Infosys");
		c.setModel("Royal");
		
		System.out.println("The color is :"+ c.getColor());
		System.out.println("The company is :"+ c.getcompanyName());
		System.out.println("The Model is :"+ c.getModel());
      
     
		
	}

}
