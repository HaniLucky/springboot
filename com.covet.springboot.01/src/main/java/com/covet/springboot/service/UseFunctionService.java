package com.covet.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 声明bean
@Service
public class UseFunctionService {
	
	// 自动注入依赖
	@Autowired
	FunctionService functionService;

	public String sayHello(String word) {
		return functionService.sayHello(word);
	}
}
