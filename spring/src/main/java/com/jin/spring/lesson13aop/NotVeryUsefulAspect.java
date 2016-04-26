package com.jin.spring.lesson13aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class NotVeryUsefulAspect {
	@Pointcut("within(com.jin.spring.lesson13aop..*)")
    public void inWebLayer() {
		System.out.println("inWebLayer is invoked!");
	}
}
