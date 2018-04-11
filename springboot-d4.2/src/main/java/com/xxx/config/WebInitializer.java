package com.xxx.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer{ //  WebApplicationInitializer 是Spring用来配置servlet3.0+配置的接口 替代web.xml的配置

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(MyMvcConfig.class);
		context.setServletContext(servletContext); // 注册配置类
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));  //  注册Springmvc的dispatcher
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
