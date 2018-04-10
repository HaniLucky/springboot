package com.xxx.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.xxx.service.impl.WindowsListService;
import com.xxx.service.impl.LinuxListService;

@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService(){
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService LinuxListService(){
		return new LinuxListService();
	}
}
