package com.jin.spring.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class AutowiredApplicationContext {
	@Autowired
    private ApplicationContext context;
	
	public <T> T getBean(Class<T> t)
	{
		return context.getBean(t);
	}
}
