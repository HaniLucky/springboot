package com.xxx.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		
		// 加载配置类
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// 多例
		Propotype p1 = context.getBean(Propotype.class);
		Propotype p2 = context.getBean(Propotype.class);
		
		// 单例
		Singleton s1 = context.getBean(Singleton.class);
		Singleton s2 = context.getBean(Singleton.class);
		
		System.out.println(s1.equals(s2));  // 单列 true
		System.out.println(p1.equals(p2));	// 多例 false
		// 关闭资源
		context.close();
	}
}
