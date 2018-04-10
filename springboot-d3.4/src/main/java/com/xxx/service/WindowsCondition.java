package com.xxx.service;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Service;

// 实现条件接口
public class WindowsCondition implements Condition{

	// 实现条件方法
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 判断当前系统是否是windows系统
		return context.getEnvironment().getProperty("os.name").contains("Windows");
	}

}
