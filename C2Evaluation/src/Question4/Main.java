package Question4;

public class Main {
        public static Person generatePerson(Person person) {
		if(person instanceof Student) {
			Student student=(Student)person;
			student.setName("Ram");
			student.setGender("Male");
			student.setCourseEnrolled("Java11");
			student.setCourseFee(5000);
			student.setStudentId(1);
			Address myaddress=new Address();
			myaddress.setCity("solapur");
			myaddress.setState("pune");;
			myaddress.setPinCode("1234");
			student.setAddress(myaddress);
			
			return student;
			
		}else {
			Instructor instructor=(Instructor)person;
			instructor.setName("Ram");
			instructor.setGender("Male");
			instructor.setInstructorId(2);
			instructor.setSalary(3000);
			Address myaddress=new Address();
			myaddress.setCity("solapur");
			myaddress.setState("pune");;
			myaddress.setPinCode("1234");
			instructor.setAddress(myaddress);
			
			return instructor;
		}
		
		
		
	}
	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
		}
}
