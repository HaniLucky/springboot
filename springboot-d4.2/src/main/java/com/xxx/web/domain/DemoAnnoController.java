package com.xxx.web.domain;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.domain.DemoObj;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {
	
	// http://127.0.0.1:8080/springboot-d4.2/anno
	@RequestMapping(produces = "text/plain;charset=UTF-8") // 定制返回的respone的媒体类型和字符集
	public @ResponseBody String index (HttpServletRequest request){
		return "url" + request.getRequestURL() + "can access";
	}
	
	// http://127.0.0.1:8080/springboot-d4.2/anno/pathvar/333
	@RequestMapping(value = "/pathvar/{str}" , produces = "text/plain;charset=UTF-8")
	public @ResponseBody String demoPathVar(@PathVariable String str ,HttpServletRequest request){
		return "url:"+request.getRequestURL() + "can access , Str :" + str ;
	}
	
	// http://127.0.0.1:8080/springboot-d4.2/anno/requestParam?id=10000
	@RequestMapping(value = "/requestParam" , produces = "text/plain;charset=UTF-8")
	public @ResponseBody String passRequestParam( Long id ,HttpServletRequest request){
		return "url:"+request.getRequestURL() + "can access , id " + id ;
	}
	
	// http://127.0.0.1:8080/springboot-d4.2/anno/obj?id=100&name=张三
	@RequestMapping(value = "/obj" , produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String passObj( DemoObj obj ,HttpServletRequest request){
		return "url:"+request.getRequestURL() + "can access , id " + obj.getId() + "name :" + obj.getName() ;
	}
	
	// http://127.0.0.1:8080/springboot-d4.2/anno/name2
	// http://127.0.0.1:8080/springboot-d4.2/anno/name1
	@RequestMapping(value = {"/name1", "/name2"},  produces = "text/plain;charset=UTF-8")
	public @ResponseBody String remove(HttpServletRequest request){
		return "url:"+request.getRequestURL() + "can access" ;
	}

}
