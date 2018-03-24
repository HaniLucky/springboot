package com.covet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <P>
 * Description: DemoPublisher相关信息 事件发布类
 * </P>
 * 
 * @ClassName: DemoPublisher
 * @author 胡良俊 2018年3月24日下午5:53:25
 */
@Component
public class DemoPublisher {

	@Autowired
	ApplicationContext applicationContext;

	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}
