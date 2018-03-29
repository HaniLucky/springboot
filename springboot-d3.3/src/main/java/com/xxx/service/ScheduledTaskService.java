package com.xxx.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Scheduled  声明该方法是定时任务
 * @author issuser
 *
 */
@Service
public class ScheduledTaskService {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	// 固定时间   每隔5秒
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime(){
		System.out.println("每隔5秒执行一次:"+dateFormat.format(new Date()));
	}
	
	// cron表达式  定时   每10秒
	@Scheduled(cron = "0/5 * * * * ? ")
	public void fixTiemeExecution(){
		System.out.println("每隔5秒执行一次(cron表达式):"+dateFormat.format(new Date()));
	}
	
}
