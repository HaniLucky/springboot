package com.xxx.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	
	public static void main(String[] args) {
		// 获取spring上下文容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
		// 获取bean
		AwareService awareService = applicationContext.getBean(AwareService.class);
		// 调用bean的方法
		awareService.outputResult();
		// 关闭资源
		applicationContext.close();
	}

}
