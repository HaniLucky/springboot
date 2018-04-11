package com.xxx.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 自定义拦截器
 * @author issuser
 * 
 *
 */
public class DemoInterceptor extends HandlerInterceptorAdapter /* 继承HandlerInterceptorAdapter来实现自定义拦截器 */{

	/**
	 *  在请求发生前执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 获取请求时间
		long timeMillis = System.currentTimeMillis();
		request.setAttribute("startTime", timeMillis );
		return true;
	}
	
	
	/**
	 *  在请求发生后执行
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 获取请求开始的时间
		Long startTime = (Long) request.getAttribute("startTime");
		request.removeAttribute("startTime");
		// 获取请求后的时间
		long endTime = System.currentTimeMillis();
		request.setAttribute("endTime", endTime);
		System.err.println(request.getRequestURL() + "请求耗时:"+(endTime - startTime) + "ms\r\n" + request.getServletPath());
		request.setAttribute("handlingTime", (endTime - startTime)+"ms");
	}
}
