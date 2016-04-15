package com.jin.spring.lesson07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jin.spring.lesson08.MovieFinder;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-lesson07.xml");
		
//		org.springframework.web.context.support.AnnotationConfigWebApplicationContext
		
		ComponentTest ctx = context.getBean(ComponentTest.class);
	
		ctx.test.msg();
		
		MovieFinder mf = context.getBean(MovieFinder.class);
		mf.msg();
	}
}
