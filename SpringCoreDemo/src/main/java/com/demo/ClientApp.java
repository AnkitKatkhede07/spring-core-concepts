package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        Employee e = (Employee) context.getBean("e");

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSal());
        e.show();

        context.close();
    }

	}
