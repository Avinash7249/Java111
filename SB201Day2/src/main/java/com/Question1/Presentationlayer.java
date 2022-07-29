package com.Question1;

public class Presentationlayer {
	
	Servicelayer s;

	public void setS(Servicelayer s) {
		this.s = s;
	}
	
	public int sum( int a,int b) {
		
		return s.Sum(a, b);
		
	}
	
    public int multiplication(int a,int b) {
		
		return s.Multiplication(a,b);
		
		}
		
	public int subtraction(int a,int b) {
		
		return s.Subtraction(a, b);
			
			
		}

	
	
	
	
	
	
   
}
	
