package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
		public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		Presentationlayer obj = ctx.getBean("a1",Presentationlayer.class);
		int a=obj.sum(2, 2);
		
		int b=obj.multiplication(2, 2);
		
		int c=obj.subtraction(2, 2);
		
	    System.out.println(a);
		
	    System.out.println(b);
	    
	    System.out.println(c);
		}

}
