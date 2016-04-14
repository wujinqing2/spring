package com.jin.spring.lesson05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");
		
		AnnotationTest2 bean = context.getBean(AnnotationTest2.class);
		bean.getAnnotationTest().msg();
		
	}
}
