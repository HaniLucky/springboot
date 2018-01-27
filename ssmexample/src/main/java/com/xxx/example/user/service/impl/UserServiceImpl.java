package com.xxx.example.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.example.user.dao.UserMapper;
import com.xxx.example.user.service.UserService;
import com.xxx.example.user.vo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findUserAll() {
		return userMapper.findUserAll();
	}

	@Override
	public List<User> findUserByName(String name) {
		return userMapper.findUserByName(name);
	}

}
