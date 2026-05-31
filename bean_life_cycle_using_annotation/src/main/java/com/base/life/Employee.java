package com.base.life;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Component("e")
public class Employee {
	@Value("1")
private int id;
	@Value("Omkar")
private String name;
	@Value("500000")
private int sal;

public Employee() {
    System.out.println("I am constructor");
}

@PostConstruct
public void myInit() {
    System.out.println("This is init method");
}

@javax.annotation.PreDestroy
public void myDestroy() {
    System.out.println("I am destroy method");
}

public void display() {
    System.out.println("I am utility method");
    System.out.println("Id : " + id);
    System.out.println("Name : " + name);
    System.out.println("Salary : " + sal);
}
//setter getter



}
