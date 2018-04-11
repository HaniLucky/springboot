package com.xxx.advice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxx.domain.DemoObj;

@Controller
public class AdviceController {

	/* http://127.0.0.1:8080/springboot-d4.2/advice?id=1&name=xx */
	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg ,DemoObj obj){  // 这里会将msg赋值给参数 并将id参数给过滤掉
		throw new IllegalArgumentException("非常抱歉,参数有误/"+"来自@ModelAttribute:"+msg);
	}
}
