package com.xxx.service;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.xxx.service")
@PropertySource("classpath:test.properties") // 7.注入配置文件
public class ELConfig {

	
	@Value("I Love You")
	private String normal; // 注入普通字符串
	
	@Value("#{systemProperties['os.name']}")  // 获取系统属性
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0 }") // 注入表达式属性
	private String randomNumber;
	
	@Value("#{demoService.author}")  // 注入其他bean的属性
	private String fromAuthor;
	
	@Value("classpath:test.txt")  // 注入文件资源
	private Resource testFile;
	
	@Value("http://www.baidu.com") // 注入网址资源
	private Resource testUrl;
	
	@Value("${book.name}") // 7.注入配置文件
	private String bookName;
	
	@Autowired
    private Environment environment;  // 7.注入配置文件
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigurer(){  // 7.注入配置文件
		return new PropertySourcesPlaceholderConfigurer();
	}
    
	public void outputResource(){
		
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAuthor);
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			 System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
