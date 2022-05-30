package Question4;

import java.util.Objects;

public class Person {

	
	String name;

	String gender ;
	
	Address address;

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

	public Person(String name, String gender, Address address) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	
	
}
