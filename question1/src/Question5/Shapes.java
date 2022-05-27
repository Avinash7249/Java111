package Question5;

public class Shapes {
	
	
	 Shapes(){};
    public  void area(Circle circle) {
		System.out.println("The Area of Circle is :"+ 3.14*circle.getRadius()*circle.getRadius());
	}
	public void area(Rectangle rectangle) {
		System.out.println("The Area of rectangle is :"+  rectangle.getBreadth()*rectangle.getLength());
	}
	public void area(Square square) {
		System.out.println("The Area of Square is :"+  2*square.getSide());
		
	}
	
	
	
	
	
	
	

}
