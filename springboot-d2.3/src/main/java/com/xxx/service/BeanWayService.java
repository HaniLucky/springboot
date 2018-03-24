package com.xxx.service;

/**
 * <P>
 * Description: BeanWayService相关信息:使用@bean形式的Bean   java配置方式
 * </P>
 * 
 * @ClassName: BeanWayService
 * @author 胡良俊 2018年3月24日下午4:37:29
 */
public class BeanWayService {

	public void init() {
		System.out.println("@Bean-init-methon");
	}

	public BeanWayService() {
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}

	public void destroy() {
		System.out.println("@Bean-destroy-method");
	}

}
