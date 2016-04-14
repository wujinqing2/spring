package com.jin.spring.lesson04;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CommandManager implements ApplicationContextAware {
	public static ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("setApplicationContext is invoked!");
		this.applicationContext = applicationContext;

	}
	


}
