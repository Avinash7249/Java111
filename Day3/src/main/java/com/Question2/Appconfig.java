package com.Question2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.Question2")
//@PropertySource("a1.properties")
public class Appconfig {
	
	@Bean(value = "map")
	public Map <Student, String> theMap(){
		
		Map<Student, String> hm =new HashMap<>();
				
		hm.put(new Student(10,"Ganesh",950),"Maharastra");
		hm.put(new Student(12,"Surya",850),"Tamilnadu");
		hm.put(new Student(15,"Venkat",920),"Telangana");
		hm.put(new Student(16,"Dinesh",910),"Haryana");
		hm.put(new Student(18,"Srinu",880),"Kerla");
	
		return hm;
		 
	 }
	 

}
