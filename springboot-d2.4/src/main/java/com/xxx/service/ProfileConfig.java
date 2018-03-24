package com.xxx.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	/** 开发环境 */
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean(){
		return new DemoBean("from development profile");
	}
	
	/** 生产环境  */
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean(){
		return new DemoBean("from production profile");
	}

}
