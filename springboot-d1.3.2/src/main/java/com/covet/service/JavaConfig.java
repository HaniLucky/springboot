package com.covet.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Describe:Java配置类</P>
 * @author Covet
 * 2018年1月11日 下午11:35:32
 */
// 声明一个java配置类
@Configuration
public class JavaConfig {

	// 声明该方法返回的是一个bean
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	// 第一种方式
	@Bean
	public UseFunctionService UseFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
		
	}
	
	// 第二种方式
		@Bean
		public UseFunctionService UseFunctionService(FunctionService functionService){
			UseFunctionService useFunctionService = new UseFunctionService();
			useFunctionService.setFunctionService(functionService);
			return useFunctionService;
			
		}
}
