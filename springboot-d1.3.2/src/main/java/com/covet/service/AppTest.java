package com.covet.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * Describe:测试类
 * </P>
 * 
 * @author Covet 2018年1月11日 下午11:25:06
 */
public class AppTest {
	public static void main(String[] args) {

		// 加载配置类
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// 获取bean
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		
		// 调用逻辑
		String sayHello = useFunctionService.sayHello(" java Config");
		System.out.println(sayHello);
		// 关闭容器
		context.close();
	}
}
