package com.Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowMapStudents {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		A a1 = ctx.getBean("maid",A.class);
		a1.show();
		}
		}
