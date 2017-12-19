package com.covet.springboot.service;

import org.springframework.stereotype.Service;

// 声明bean
@Service
public class FunctionService {
	public String sayHello(String word) {
		return "Hello"+word+"!";
	}
}
