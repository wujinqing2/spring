package com.jin.spring.lesson04;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * In the <list/>, <set/>, <map/>, and <props/> elements, 
 * you set the properties and arguments of the Java Collection types 
 * List, Set, Map, and Properties, respectively.
 * @author wu.jinqing
 * @date 2016年4月13日
 */
public class ComplexObject {
	private Properties adminEmails;
	
	private List<String> someList;
	
	private Map<String, String> someMap;
	
	private Set<String> someSet;

	public Properties getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	public List<String> getSomeList() {
		return someList;
	}

	public void setSomeList(List<String> someList) {
		this.someList = someList;
	}

	public Map<String, String> getSomeMap() {
		return someMap;
	}

	public void setSomeMap(Map<String, String> someMap) {
		this.someMap = someMap;
	}

	public Set<String> getSomeSet() {
		return someSet;
	}

	public void setSomeSet(Set<String> someSet) {
		this.someSet = someSet;
	}
	
	
}
