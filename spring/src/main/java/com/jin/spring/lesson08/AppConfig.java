package com.jin.spring.lesson08;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jin.spring.lesson07, com.jin.spring.lesson08")
public class AppConfig {
//	@Bean
//	public MovieFinder myService() {
//        return new MovieFinder();
//    }
}
