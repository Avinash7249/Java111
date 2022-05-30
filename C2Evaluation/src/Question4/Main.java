package Question4;

public class Main {

	
	
	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public static Person generatePerson(Person person) {
		
		
	}
	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Teacher());

		System.out.println(newStudent);
		System.out.println(newTeacher)
		}
}
