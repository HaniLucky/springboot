package com.xxx.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.xxx.service")
// 开启定时任务配置
@EnableScheduling
public class ScheduledConfig {

}
