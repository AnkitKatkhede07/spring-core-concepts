package com.base.beanlifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configure.configure;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(configure.class);
Students std=(Students)context.getBean("s");
System.out.println(std.getRollNo());
System.out.println(std.getName());
System.out.println(std.getMarks());

std.display();
context.close();
	}

}
