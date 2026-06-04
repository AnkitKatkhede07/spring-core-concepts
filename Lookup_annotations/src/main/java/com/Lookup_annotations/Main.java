package com.Lookup_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configure.confuguration;

public class Main {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(confuguration.class);
		Test t1=(Test)context.getBean("t");
		Demo d1=t1.display();
		Demo d2=t1.display();
		Demo d3=t1.display();
		Demo d4=t1.display();
		context.close();
		
	}
}
