package com.jin.spring.lesson11;

import org.springframework.context.ApplicationListener;

public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

	@Override
//	@EventListener
	public void onApplicationEvent(BlackListEvent event) {
		event.alert();
		
	}

}
