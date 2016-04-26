package com.jin.spring.lesson12;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring里面的观察者模式的实现
 * 
 * 被观察者继承ApplicationEvent类
 * 观察者实现ApplicationListener接口并重写onApplicationEvent方法
 * 环境角色实现ApplicationEventPublisherAware接口用于发布事件
 * 
 * @author wu.jinqing
 * @date 2016年4月22日
 */
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-lesson12.xml");
		
//		MessageSource  ms = context.getBean(MessageSource.class);
//		EmailService  emailService = context.getBean(EmailService.class);
//		
//		emailService.sendEmail("known.spammer@example.org", "test");
		
	}
}
