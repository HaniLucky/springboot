package com.xxx.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

// 多例bean
@Service
@Scope("prototype")
public class Propotype {

}
