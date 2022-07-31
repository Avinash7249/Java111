package com.Question2;

import java.util.Map;
@Bean(value = "map")
public class A {
	
	
	public Map <Student, String> theMap(){
		 
	 }

	private Map<Student, String> theMap;
	public void setTheMap(Map<Student,String> theMap) {
	this.theMap = theMap;
	}
	public void show() {
	
	System.out.println(theMap);
	}
	}
