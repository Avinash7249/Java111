package Question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		
		HashMap <String , Student> student =new HashMap<>();
		
		student.put("Maharastra",new Student(10,"Ganesh",950));
		student.put("Tamilnadu",new Student(12,"Surya",850));
		student.put("Telangana",new Student(15,"Venkat",920));
		student.put("Haryana",new Student(16,"Dinesh",910));
		student.put("Kerla",new Student(18,"Srinu",880));

		
		
		Collection<Student> cols = student.values();
		
		List<Student> students = new ArrayList<>(cols);
		
		Collections.sort(students, new SortStudentmarks());
		
		for(Student student1:students){

			System.out.println(student1);
		System.out.println("=========================");
		}

		
	}

}
