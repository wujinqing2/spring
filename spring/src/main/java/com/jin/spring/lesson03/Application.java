package com.jin.spring.lesson03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ClientBean p = context.getBean(ClientBean.class);
		
		p.getTargetName().msg();
	}
}
