package com.xxx.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
		
		ELConfig config = context.getBean(ELConfig.class);
		config.outputResource();
		
		context.close();
	}

}
