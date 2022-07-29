package com.Question2;

public class Demo {
	
	
	
	public void mySetup() {
		System.out.println("object with is initialised...");
		
		}
	
	public void destroy() {
		System.out.println("object isdestroyed");
		
		}
	

}
//. What are the steps involved in the bean life cycle?
//For ordinary java class constructor and finalize() methods can be considered as life cycle methods
//for spring bean class following stages are :
//1. Does not exist
//2. Instantiated
//3. Initialized
//4. Service
//5. Destroy