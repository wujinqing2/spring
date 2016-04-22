package com.jin.spring.lesson10;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		System.out.println(Application.class.getResource(""));
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-lesson10.xml");
		
//		MessageSource  ms = context.getBean(MessageSource.class);
		MessageSource  ms = context.getBean(MessageSource.class);
		
//		String message = ms.getMessage("message", null, "Default", null);
//	    System.out.println(message);
//	    ReloadableResourceBundleMessageSource 
//	    String message1 = ms.getMessage("argument.required", new Object[]{"Hello"}, "Default", null);
//	    System.out.println(message1);
	    
	    String message = ms.getMessage("message", null, "Default", Locale.UK);
	    System.out.println(message);
	    
	    String message1 = ms.getMessage("argument.required", new Object[]{"Hello"}, "Default", Locale.UK);
	    System.out.println(message1);
		
		
	}
}
