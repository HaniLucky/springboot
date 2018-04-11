package com.xxx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.xxx.interceptor.DemoInterceptor;

/**
 *	视图解析器配置类
 */
@Configuration
@EnableWebMvc   // 开启springmvc支持
@ComponentScan("com.xxx")
public class MyMvcConfig extends WebMvcConfigurerAdapter /* mvc配置适配器 */{
	
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
	
	// 添加资源处理程序   处理静态资源
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// addResourceHandler 指定文件放置的目录   addResourceLocations  对外暴露的访问路径
		registry.addResourceHandler("assets/**").addResourceLocations("classpath:/assets/");
	}

	/* ========================= 配置拦截器 start ================================= */ 
	@Bean
	public  DemoInterceptor demoInterceptor(){
		return new DemoInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 注册自定义拦截器
		registry.addInterceptor(demoInterceptor());
	}
	/* ========================= 配置拦截器 end ================================= */ 
	
	
	// http://127.0.0.1:8080/springboot-d4.2/index
	/* 页面转向设置  简化页面转向 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("index");
		//添加页面上传转向
		registry.addViewController("/toUpload").setViewName("upload");
	}
	
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(6000000); // 设置上传图片最大值  6M
		return multipartResolver;

	}
	
	
	
	/* 路径匹配参数配置  */
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		configurer.setUseSuffixPatternMatch(false);  // 设置使用后缀匹配模式为false
	}
}
