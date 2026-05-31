package com.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("add")
@Primary
public class Add implements Setval {

	@Value("10")
	private int a;
	@Value("20")
	private int b;
	@Override
	public void setA(int a) {
		this.a=a;
		
	}

	@Override
	public void setB(int b) {
		this.b=b;
		
	}

	@Override
	public int getResult() {
		
		return a+b;
	}

}
