package com.xxx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 声明为一个bean
public class UseFunctionService {
	
	// 调用一个bean
	@Autowired
	private FunctionService functionService;
	
	// 调用functionService的方法
	public String sayHello(String word){
		return functionService.sayHello(word);
	}

}
