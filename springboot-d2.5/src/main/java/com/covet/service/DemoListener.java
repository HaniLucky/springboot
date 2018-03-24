package com.covet.service;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 定义一个事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	public void onApplicationEvent(DemoEvent demoEvent) {
		String msg = demoEvent.getMsg();
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息" + msg);
	}

}
