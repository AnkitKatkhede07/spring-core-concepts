package com.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("text.xml");
		Employee emp=(Employee)context.getBean("e");
		emp.show();
		}

}
 