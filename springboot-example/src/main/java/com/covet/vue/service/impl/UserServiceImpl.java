package com.covet.vue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covet.vue.mapper.UserMapper;
import com.covet.vue.model.User;
import com.covet.vue.model.UserExample;
import com.covet.vue.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAllUser() {
		return userMapper.selectByExample(new UserExample());
	}

}
