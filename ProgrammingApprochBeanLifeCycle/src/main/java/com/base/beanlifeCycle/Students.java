package com.base.beanlifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Component("s")
public class Students implements InitializingBean,DisposableBean {
	@Value("1")
	private int rollNo;
	@Value("Mayur")
	private String name;
	@Value("126000")
	private int marks;
	public void display() {
		System.out.println("I am utility method");
	}
	@Override
	public void destroy() throws Exception {
		
		 System.out.println("I am destroy method");	
	}
	@Override
	public void afterPropertiesSet() throws Exception {
	    System.out.println("I am init method");	
		
	}

}
