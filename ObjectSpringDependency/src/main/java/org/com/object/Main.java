package org.com.object;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("text.xml");

        Parcel p = (Parcel) context.getBean("p");

        System.out.println("Parcel Id : " + p.getId());
        System.out.println("Parcel Name : " + p.getName());

        Customer c = p.getCustomer();

        System.out.println("Customer Id : " + c.getId());
        System.out.println("Customer Name : " + c.getName());

        context.close();
    }
}