package com.xxx.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		// 先将活动的Profile(配置文件)设置为prod
		applicationContext.getEnvironment().setActiveProfiles("prod");
		// 后置注册Bean配置类,不然会Bean未定义异常
		applicationContext.register(ProfileConfig.class);
		// 刷新容器
		applicationContext.refresh();

		// 获取bean
		DemoBean demoBean = applicationContext.getBean(DemoBean.class);
		// 获取配置信息
		System.out.println(demoBean.getContent());

		// 关闭容器
		applicationContext.close();
	}

}
