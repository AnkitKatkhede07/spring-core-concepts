package com.base.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import confegure.com.Configure;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
		Employee emp=(Employee)context.getBean("e");
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
		emp.display();
		context.close();
		
	}

}
