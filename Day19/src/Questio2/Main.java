package Questio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List <Student> student=new ArrayList<>();
		
		student.add(new Student(1,"ram",123));
		
		student.add(new Student(6,"ramesh",129));
		
		student.add(new Student(4,"raghv",423));
		
		student.add(new Student(2,"raj",173));
		
		student.add(new Student(9,"rajanikat",523));
		
		Stream<Student> student1=student.stream();
		
	 List<Employee> employee = student1.map(s-> {
		  return new Employee(s.getRoll(),s.getName(),s.getMarks()*1000);
	  }).collect(Collectors.toList());
	 
	 employee.forEach(s->System.out.println(s));

	}

}
