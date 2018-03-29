package com.xxx.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
	
	// 开启一个异步任务  该注解将该方法加入到ThreadPollTaskExecutor中做为一个TaskExecutor
	@Async
	public void executeAsyncTask(Integer  i){
		System.out.println("执行异步任务:"+ i);
	}
	@Async
	public void executeAsyncTaskPlus(Integer  i){
		System.err.println("执行异步任务+1:"+ (i+1));
	}


}
