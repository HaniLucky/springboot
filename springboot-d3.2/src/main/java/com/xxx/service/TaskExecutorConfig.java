package com.xxx.service;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("com.xxx.service")
// 声明支持多线程
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer{

	// 初始化一个线程池
	// @Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		// 核心线程池大小
		taskExecutor.setCorePoolSize(5);
		// 最大线城数
		taskExecutor.setMaxPoolSize(10);
		// 等待线程容量
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}
	// @Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		
		return null;
	}

	
	

}
