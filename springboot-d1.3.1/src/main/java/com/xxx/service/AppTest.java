package com.xxx.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);  // 获取上下文对象
		
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		String sayHello = useFunctionService.sayHello("World");
		System.err.println(sayHello);
		context.close();
		
		
	}

}
