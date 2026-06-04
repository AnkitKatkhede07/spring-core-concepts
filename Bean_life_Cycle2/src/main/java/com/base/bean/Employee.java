package com.base.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("e")
public class Employee {
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	@Value("101")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("Abhijit")
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	@Value("200000")
	public void setSal(int sal) {
		this.sal = sal;
		
	}
		@javax.annotation.PostConstruct
		public void myInit() {
			System.out.println("this is the init method");
		}
		public void display() {
			 System.out.println("I am utility method");
			
		}
		@javax.annotation.PreDestroy
		public void myDestroy() {
			System.out.println("Iam destroy method");
		}

	
	

}
