package com.xxx.example.user.service;

import java.util.List;

import com.xxx.example.user.vo.User;

public interface UserService {
	
	/** 查询所有user */
	List<User> findUserAll();
	
	List<User> findUserByName(String name);
}
