package base.Eager.Loading;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configure.TextConfigure;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(TextConfigure.class);
		
		       cont.close();
	}

}
