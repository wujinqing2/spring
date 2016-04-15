package com.jin.spring.lesson05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class AnnotationTest2 {
	@Autowired
	@Qualifier("annotationTest")// 限定bean的名称
	private AnnotationTest annotationTest;

	public AnnotationTest getAnnotationTest() {
		return annotationTest;
	}

	public void setAnnotationTest(AnnotationTest annotationTest) {
		this.annotationTest = annotationTest;
	}
}
