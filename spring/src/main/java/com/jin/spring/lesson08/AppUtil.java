package com.jin.spring.lesson08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppUtil {
	public static ApplicationContext context;
	
	@Autowired
	public void setApplicationContext(
			ApplicationContext applicationContext) {
		AppUtil.context = applicationContext;
	}
}
