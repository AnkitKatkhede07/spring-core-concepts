package base.Eager.Loading;

import org.springframework.stereotype.Component;

@Component("d")
public class Demo {
	public Demo() {
		System.out.println("Demo bean object created by spring container");
	}

}
