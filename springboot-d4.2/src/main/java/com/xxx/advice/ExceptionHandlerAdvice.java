package com.xxx.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller异常处理器
 * @author issuser
 *
 */
@ControllerAdvice  /* 声明一个控制器建言  组合一个controller注解 自动组装为一个Bean */
public class ExceptionHandlerAdvice {
	
	@ExceptionHandler(value = Exception.class)  // 定义全局处理  value 表示是一个过滤条件 拦截所有的Exception
	public ModelAndView exception(Exception exception, WebRequest request){
		ModelAndView model = new ModelAndView("error");
		model.addObject("errorMessage",exception.getMessage());
		return model;
	}
	
	@ModelAttribute  // 将键值添加到全局 所有注解RequestMapper方法都可以获取此键值对
	public void addAttributes(Model model){
		model.addAttribute("msg", "额外信息");
	}
	
	@InitBinder  // 定制WebDataBinder
	public void initBinder(WebDataBinder webDataBinder){
		webDataBinder.setDisallowedFields("id");   // 此处会忽略请求参数中的id
	}

}
