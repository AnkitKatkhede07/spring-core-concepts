package base.Eager.Loading;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component("e")
public class Employee implements InitializingBean,DisposableBean {
	public Employee() {
		System.out.println("Employee bean object created by spring container ");

	}
	@Value("201")
	private int id;
	@Value("Ankit")
	private String name;
	public void display()
	{
		System.out.println("I am Utility methods");
	}
	@Override
	public void destroy() throws Exception {
		   System.out.println("I am destroy method");	

		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
