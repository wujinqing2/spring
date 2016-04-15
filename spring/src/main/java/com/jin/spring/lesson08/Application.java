package com.jin.spring.lesson08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jin.spring.lesson07.ComponentTest;

public class Application {
	public static void main(String[] args) {
		
		
//		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		    ctx.register(AppConfig.class, OtherConfig.class);
//		    ctx.register(AdditionalConfig.class);
//		    ctx.refresh();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		AppUtil appUtil = context.getBean(AppUtil.class);
		
		MovieFinder mf = AppUtil.context.getBean(MovieFinder.class);
		mf.msg();
		
//		MovieFinder mf = context.getBean(MovieFinder.class);
//		mf.msg();
		
		
		ComponentTest ctx = context.getBean(ComponentTest.class);
		
		ctx.test.msg();
		
	}
}
