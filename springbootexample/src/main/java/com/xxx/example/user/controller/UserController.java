package com.xxx.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.example.user.service.UserService;
import com.xxx.example.user.vo.User;

/**
 * <P>Description: UserController相关信息</P>
 * @ClassName: UserController
 * @author 胡良俊  2018年1月27日下午2:06:17
 * 实现人员列表查询
 */

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list") // http://localhost:8080/user/list
	public List<User> findUserAll(){
		return userService.findUserAll(); 
	}

}
