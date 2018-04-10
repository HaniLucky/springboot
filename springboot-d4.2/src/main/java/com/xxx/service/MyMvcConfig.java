package com.xxx.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *	视图解析器配置类
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.xxx")
public class MyMvcConfig {
	
	@Bean
	public  InternalResourceViewResolver viewResolver(){
		// 配置视图解析器
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		// 视图解析器前缀
		viewResolver.setPrefix("/WEB-INF/classes/views/");   
		// 视图解析器后缀
		viewResolver.setSuffix(".jsp");
		// 配置视图
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
		
	}

}
