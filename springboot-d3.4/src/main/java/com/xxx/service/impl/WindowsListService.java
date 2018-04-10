package com.xxx.service.impl;

import org.springframework.stereotype.Service;

import com.xxx.service.ListService;

@Service
public class WindowsListService implements ListService {

	public String showListCmd() {
		return "dir";
	}

}
