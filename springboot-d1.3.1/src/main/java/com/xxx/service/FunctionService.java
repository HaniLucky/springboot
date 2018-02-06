package com.xxx.service;

import org.springframework.stereotype.Service;

// 使用注解声明为一个bean
@Service
public class FunctionService {
	public String sayHello(String word){
		return "Hello "+word;
	}

}
