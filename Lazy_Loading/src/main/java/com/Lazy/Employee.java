package com.Lazy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component("e")
@Lazy
@Setter
@Getter
public class Employee {
	public Employee() {
		System.out.println("Employee bean object created by spring container ");
	}
	@Value("1")
    private int id;
	@Value("Ankit")
    private String name;
    
    
}
