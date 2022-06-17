package Question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		
		HashMap <String , Student> student =new HashMap<>();
		
		student.put("Maharastra",new Student(10,"Ganesh",950));
		student.put("Tamilnadu",new Student(12,"Surya",850));
		student.put("Telangana",new Student(15,"Venkat",920));
		student.put("Haryana",new Student(16,"Dinesh",910));
		student.put("Kerla",new Student(18,"Srinu",880));

		Set<Map.Entry<String, Student>> studentset=student.entrySet() ;
		
		Set<Map.Entry<String, Student>> stTree=new TreeSet(new SortStudentmarks());
		
		for(Map.Entry<String, Student> s :studentset) {
			stTree.add(s);
		}
		
		
		
		for(Map.Entry<String, Student> student1:stTree){

			System.out.println(student1.getKey()+"------"+student1.getValue());
		System.out.println("=========================");
		}

		
	}

}
