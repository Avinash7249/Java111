package com.Question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	
		 public static void main(String[] args) {
				
				ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
				Presentationlayer obj = ctx.getBean("s",Presentationlayer.class);
				
				int a=obj.sum(2, 2);
				
				int b=obj.multiplication(2, 2);
				
				int c=obj.subtraction(2, 2);
				
			    System.out.println(a);
				
			    System.out.println(b);
			    
			    System.out.println(c);
			    
			}

	

}
