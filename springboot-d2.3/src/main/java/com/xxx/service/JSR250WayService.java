package com.xxx.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <P>
 * Description: JSR250WayService相关信息   注解配置方式
 * </P>
 * 
 * @ClassName: JSR250WayService
 * @author 胡良俊 2018年3月24日下午4:43:44
 */
public class JSR250WayService {

	@PostConstruct
	public void init() {
		System.out.println("JSR250WayService-init-method");
	}

	public JSR250WayService() {
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}

	@PreDestroy
	public void destory() {
		System.out.println("JSR250WayService-destory-method");
	}

}
