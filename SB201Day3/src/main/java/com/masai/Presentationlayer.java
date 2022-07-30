package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "a1")
public class Presentationlayer {
@Autowired
private Servicelayer b1;

public int sum( int a,int b) {
	
	return b1.Sum(a, b);
	
}

public int multiplication(int a,int b) {
	
	return b1.Multiplication(a,b);
	
	}
	
public int subtraction(int a,int b) {
	
	return b1.Subtraction(a, b);
		
		
	}


}
