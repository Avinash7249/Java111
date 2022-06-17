package Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Questio2.Student;

public class Main {

	public static void main(String[] args) {
		

		List <Student> student=new ArrayList<>();
		
		student.add(new Student(1,"ram",123));
		
		student.add(new Student(6,"ramesh",129));
		
		student.add(new Student(4,"raghv",423));
		
		student.add(new Student(2,"raj",803));
		
		student.add(new Student(9,"rajanikat",523));
		
		Stream<Student> student1=student.stream();
		
		List<Student> ss=student1.filter(s->s.getMarks()<800).collect(Collectors.toList());
		
		ss.forEach(s->System.out.println(s));

	}

}
