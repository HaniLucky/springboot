package com.xxx.web.domain;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.domain.DemoObj;

@RestController // 相当于responeBody与Controller的功能
@RequestMapping("/rest")
public class DemoRestController {
	
	// http://127.0.0.1:8080/springboot-d4.2/rest/getJson?id=1&name=xx
	@RequestMapping(value = "/getJson" , produces = "application/json;charset=UTF-8")  // 返回json
	public DemoObj getJson (DemoObj demoObj , HttpServletRequest request){
		return new DemoObj(demoObj.getId()+1,demoObj.getName()+"yy");
	}
	
	// http://127.0.0.1:8080/springboot-d4.2/rest/getXml?id=1&name=xx
	@RequestMapping(value = "/getXml" , produces = "application/xml;charset=UTF-8")  // 返回xml
	public DemoObj getXml (DemoObj demoObj , HttpServletRequest request){
		return new DemoObj(demoObj.getId()+1,demoObj.getName()+"yy");
	}
	

}
