package org.com;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerClientApplication {

	public static void main(String[] args) {
		 try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("player.xml")) {
			Player player=(Player)context.getBean("p");
			 	 System.out.println(player.getId()+"\t"+player.getName()+"\t"+player.getrun());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
