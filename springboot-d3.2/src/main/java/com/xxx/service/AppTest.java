package com.xxx.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				TaskExecutorConfig.class);
		AsyncService asyncService = applicationContext.getBean(AsyncService.class);
		for (int j = 0; j < 10; j++) {
			asyncService.executeAsyncTask(j);
			asyncService.executeAsyncTaskPlus(j);
		}
		applicationContext.close();

	}
}
