package com.Lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configur.confuger;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(confuger.class);
         Demo d=(Demo)cont.getBean("d");
         cont.close();
	}

}
