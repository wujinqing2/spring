package com.jin.spring.lesson04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ParentObject p = CommandManager.applicationContext.getBean(ParentObject.class);
		
		System.out.println(p.getAdminEmails());
	}
}
