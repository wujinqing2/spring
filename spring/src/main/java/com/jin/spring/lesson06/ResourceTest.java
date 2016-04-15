package com.jin.spring.lesson06;

import javax.annotation.Resource;

public class ResourceTest {
	
	public Test test;
	public String name;

	
	@Resource
	public void wap(Test a, String n)
	{
		this.test = a;
		this.name = n;
	}
	
}
