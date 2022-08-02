package com.Question2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.Question2")
@PropertySource("a.properties")
public class Appconfig {
	
	@Autowired
	private Environment env;
	
	@Bean(value = "map")
	public Map <Student, String> theMap(){
		
		Map<Student, String> hm =new HashMap<>();
				
		hm.put(new Student(10,"Ganesh",950),env.getProperty("c1"));
		hm.put(new Student(12,"Surya",850),env.getProperty("c2"));
		hm.put(new Student(15,"Venkat",920),env.getProperty("c3"));
		hm.put(new Student(16,"Dinesh",910),env.getProperty("c4"));
		hm.put(new Student(18,"Srinu",880),env.getProperty("c5"));
	
		return hm;
		 
	 }
	 

}
