package Question4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array of Animal class with size 3
		//initialize all 3 elements of this Animal class with 
		//Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		Animal [] animal=new Animal[3];
		animal[0]=new Dog();
		animal[1]=new Cat();
		animal[2]=new Tiger();
		
		System.out.println("================");
		
		animal[0].eat();
		animal[0].walk();
		animal[0].makeNoise();
		
		System.out.println("================");
		
		animal[1].eat();
		animal[1].walk();
		animal[1].makeNoise();
		System.out.println("================");
		animal[2].eat();
		animal[2].walk();
		animal[2].makeNoise();
		
		System.out.println("================");
		
	}

}
