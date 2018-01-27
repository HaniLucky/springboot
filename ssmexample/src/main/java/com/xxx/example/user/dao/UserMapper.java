package com.xxx.example.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.xxx.example.user.vo.User;

@Mapper
public interface UserMapper {
	
	
	// mybatis注解实现 一般不这样实现  使用mybatis逆向工程来实现
	@Select("SELECT * FROM `user`WHERE NAME LIKE '%${value}%' ") //@Update @Delete @Insert
	List<User> findUserByName(String name);
	
	List<User> findUserAll();

}
