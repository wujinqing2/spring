package com.jin.spring.lesson11;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {

	private final String address;
    private final String test;

    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
    }
    
    public void alert()
    {
    	System.out.println("this is black address: " + address);
    }
    
}
