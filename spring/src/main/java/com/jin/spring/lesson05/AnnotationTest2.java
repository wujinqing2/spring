package com.jin.spring.lesson05;

import org.springframework.beans.factory.annotation.Autowired;


public class AnnotationTest2 {
	@Autowired
	private AnnotationTest annotationTest;

	public AnnotationTest getAnnotationTest() {
		return annotationTest;
	}

	public void setAnnotationTest(AnnotationTest annotationTest) {
		this.annotationTest = annotationTest;
	}
}
