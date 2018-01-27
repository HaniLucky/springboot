package com.xxx.example.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.xxx.example.user.vo.User;

public interface UserDao extends JpaRepository<User, Long>{
	
}
