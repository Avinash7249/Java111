package Question4;

public class Instructor extends Person {

	int instructorId ;

	int salary ;

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	}

	public Instructor(String name, String gender, Address address, int instructorId, int salary) {
		super(name, gender, address);
		this.instructorId = instructorId;
		this.salary = salary;
	}
	
}
