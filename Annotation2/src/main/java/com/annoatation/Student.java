package com.annoatation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class Student {
	private int id;
	private String name;
	private String depart;
	public int getId() {
		return id;
	}
	@Value("1")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("Ankit")
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	@Value("Information Technology")
	public void setDepart(String depart) {
		this.depart = depart;
	}
	

}
