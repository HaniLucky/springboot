package com.xxx.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService listService = context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令为:"+listService.showListCmd());
	}
}
