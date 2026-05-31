package com.base.life;
import com.confgure.Confgure;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Confgure.class);
	        Employee emp = context.getBean("e", Employee.class);
	        emp.display();

	        context.close();
	}

}
