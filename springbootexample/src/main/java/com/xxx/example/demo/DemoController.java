package com.xxx.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <P>Description: DemoController相关信息</P>
 * @ClassName: DemoController
 * @author 胡良俊  2018年1月27日下午1:13:35
 */
@RestController  // 相当于Controller加RequestBody(声明是一个接口并以json的格式返回)
public class DemoController {

	@RequestMapping("index")  // http://localhost:8080/index
	public String info(){
		return "success";
	}
}
