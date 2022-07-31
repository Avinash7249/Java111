package com.Question2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service(value="a")
public class A {
	
	@Autowired
	public Map <Student, String> theMap;

	
	public void show() {
	
	System.out.println(theMap);
	
	}
	}
