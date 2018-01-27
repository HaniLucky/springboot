package com.xxx.example.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xxx.example.user.dao.UserDao;
import com.xxx.example.user.service.UserService;
import com.xxx.example.user.vo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findUserAll() {
		return userDao.findAll();
	}

}
