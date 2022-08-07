package com.masai.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class GlobalExceptionHandler {
	
	
	//to handle specific ProductNotFoundException
	@ExceptionHandler(ProductNotFound.class)
	public void myIllegalHandler(HttpServletResponse resp,ProductNotFound ie) throws IOException {
	System.out.println("inside myHandler method...");
	resp.sendError(HttpStatus.BAD_REQUEST.value(),ie.getMessage());
	}
	
	//to handle specific NullValueerrorException
	@ExceptionHandler(NullValueerror.class)
	public void myIllegalHandler(HttpServletResponse resp,NullValueerror ie) throws IOException {
	System.out.println("inside myHandler method...");
	resp.sendError(HttpStatus.BAD_REQUEST.value(),ie.getMessage());
	}
	
	
	
	
	//to handle specific InvalidURIException
		@ExceptionHandler(InvalidURIException.class)
		public void myIllegalHandler(HttpServletResponse resp,InvalidURIException ie) throws IOException {
		System.out.println("inside myHandler method...");
		resp.sendError(HttpStatus.BAD_REQUEST.value(),ie.getMessage());
		}
	
	
	
	
	
	//to handle any other type of Exception
	@ExceptionHandler(Exception.class)
	public void myExceptionHandler(HttpServletResponse resp,Exception e) throws IOException {
	System.out.println("inside myHandler method...");
	resp.sendError(HttpStatus.BAD_REQUEST.value(),e.getMessage());
	}
	

}
