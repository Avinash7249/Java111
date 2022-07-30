package com.masai;

import org.springframework.stereotype.Service;

@Service
public class Servicelayer {
public int  Sum(int a,int b) {
		
		return a+b;
	}
	
	public int Multiplication(int a,int b) {
		
		return a*b;
		
		}
		
	public int Subtraction(int a,int b) {
		
		return (a-b);
			
			
		}
}