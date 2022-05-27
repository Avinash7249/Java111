package Question5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Shapes s=new Shapes();
			Circle c=new Circle();
			Rectangle r=new Rectangle();
			
			Square S=new Square();
			r.setBreadth(3);
			r.setLength(5);
			S.setSide(2);
			c.setRadius(5);
			s.area(c);
			s.area(r);
			s.area(S);
			

		
	}

}
