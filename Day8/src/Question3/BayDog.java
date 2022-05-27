package Question3;

public class BayDog extends Animal{

	   @Override
		void eat(){
		System.out.println("drinking milk");
		}
		public static void main(String args[]){
		Animal a1,a2,a3;
		a1=new Animal();
		a2=new Dog();
		a3=new BayDog();
		a1.eat();
		a2.eat();
		a3.eat();
		}
		
		}

//Runtime polymorphisim achived by Method overriding only not by any parameter
