package Question2;

public class ClassCastException {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal a=new Dog();
       a.eat();
//		Dog d=new Animal();
//		d.eat();
	}

}
//Explain ClassCastException with the help of the example.
//ClassCast Exception in Java is one of the unchecked exceptions that 
//occur when we try to convert one class type object into another class type.
//ClassCast Exception is thrown when we try to cast an object of the parent 
//class to the child class object.

//type cast an parent type to its child type. In order to deal
//with ClassCastException be careful that when you're trying to 
//typecast an object of a class into another class ensure that the
//new type belongs to one of its parent classes
//or do not try to typecast a parent object to its child type.