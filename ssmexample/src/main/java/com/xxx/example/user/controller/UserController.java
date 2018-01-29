package com.xxx.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.example.user.service.UserService;
import com.xxx.example.user.vo.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * <P>
 * Description: UserController相关信息
 * </P>
 * 
 * @ClassName: UserController
 * @author 胡良俊 2018年1月27日下午2:06:17 实现人员列表查询
 */

@RestController
@RequestMapping("/user")
@Api(value = "Shop")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "查询所有用户", notes = "查询所有用户并展示")
	@RequestMapping(value = "/list",method = RequestMethod.GET) // http://localhost:8080/user/list
	public List<User> findUserAll() {
		return userService.findUserAll();
	}
	
	@ApiOperation(value = "模糊查询" ,notes = "根据名称进行模糊查询")
	@RequestMapping(value = "/list/{name}" ,method = RequestMethod.GET) // http://localhost:8080/user/list/%E5%BC%A0
	public List<User> findUserByName(@ApiParam(value="名字") @PathVariable String name) {
		return userService.findUserByName(name);
	}
}
