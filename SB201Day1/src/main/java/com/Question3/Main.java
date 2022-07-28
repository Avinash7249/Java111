package com.Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
//		Triangle mb = ctx.getBean(Triangle.class,"mb");
//		
//		Circle c = ctx.getBean(Circle.class,"c");
//		
//		Cylinder cl = ctx.getBean(Cylinder.class,"cl");
//		
//		
//		mb.draw();
//		
//		c.draw();
//		
//		cl.draw();
		
		Start tr = ctx.getBean(Start.class,"t");
		tr.journey();


	}

}
