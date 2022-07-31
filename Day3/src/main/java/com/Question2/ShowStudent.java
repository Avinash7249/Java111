package com.Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowStudent {
	
public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

		
		
		Student collage1 = ctx.getBean("s2",Student.class);
		Student collage2 = ctx.getBean("s3",Student.class);
		Student collage = ctx.getBean("s1",Student.class);
		Student collage3 = ctx.getBean("s4",Student.class);
		Student collage4 = ctx.getBean("s5",Student.class);

		
		 collage.displayDetails();
		 System.out.println("-----------------------------");
		 collage1.displayDetails();
		 System.out.println("-----------------------------");
		 collage2.displayDetails();
		 System.out.println("-----------------------------");
		 collage3.displayDetails();
		 System.out.println("-----------------------------");
		 collage4.displayDetails();
		 System.out.println("-----------------------------");
		}

}
