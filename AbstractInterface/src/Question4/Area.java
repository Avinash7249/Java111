package Question4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {

     System.out.println(breadth*length);
		return 0;
	}

	@Override
	public int squareArea(int side) {
		
		System.out.println(4*side);
		return 0;
	}

	@Override
	public int circleArea(int radius) {
		System.out.println(3.14*radius*radius);
		return 0;
	}

}
