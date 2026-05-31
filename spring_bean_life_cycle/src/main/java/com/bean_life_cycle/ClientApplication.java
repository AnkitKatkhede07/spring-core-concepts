package com.bean_life_cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("text.xml");
		
		Employee emp=(Employee)context.getBean("e");
		emp.display();
		System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
		context.close();
	}

}
