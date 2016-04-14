package com.jin.spring.lesson06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-lesson06.xml");
		
		AutowiredApplicationContext ctx = context.getBean(AutowiredApplicationContext.class);
		
		Test test = ctx.getBean(Test.class);
		
		test.msg();
	}
}
