package com.jin.spring.lesson04;

import java.util.Properties;

/**
 * In the <list/>, <set/>, <map/>, and <props/> elements, 
 * you set the properties and arguments of the Java Collection types 
 * List, Set, Map, and Properties, respectively.
 * @author wu.jinqing
 * @date 2016年4月13日
 */
public class ParentObject {
	private Properties adminEmails;
	

	public Properties getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}
	
}
