package com.masai.exception;

public class BooktNotFound extends RuntimeException{
	
	public BooktNotFound() {
	}
	
	public BooktNotFound(String message) {
		
	super(message);
	
	}

}
