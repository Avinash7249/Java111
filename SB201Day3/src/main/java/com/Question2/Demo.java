package com.Question2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

		public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		City a = ctx.getBean("aid",City.class);
		
		a.show();
		
		
		
		}
		
		
		
}
