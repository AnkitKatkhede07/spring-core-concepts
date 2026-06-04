package com.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cal")
public class Calculator {
    @Autowired
  @Qualifier("mul") 
	
	private Setval setval;
	public void setOperation(Setval setVal) {
		this.setval=setVal;
	}
	public void show() {
		System.out.println("Result is "+setval.getResult());
	}


}
