package com.covet.service;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件 实现ApplicationEvent 定义一个自定义事件
 */
public class DemoEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public DemoEvent(Object source, String mag) {
		super(source);
		this.msg = msg;
	}

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
