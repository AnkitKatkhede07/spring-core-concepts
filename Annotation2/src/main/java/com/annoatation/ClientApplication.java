package com.annoatation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.confugre.ConfigApp;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
		Student std=(Student)context.getBean("s");
		System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getDepart());
		context.close();
		
	}

}
