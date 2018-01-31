package com.covet.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>Describe:调用service</P>
 * @author Covet
 * 2018年1月11日 下午11:19:07
 */
public class UseFunctionService {

	// 注入bena 使该类拥有functionService的功能
	private FunctionService functionService;

	public String sayHello(String word) {

		// 调用service层方法
		return functionService.sayHello(word);
	}

	// set方法用于注册bean
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
}
