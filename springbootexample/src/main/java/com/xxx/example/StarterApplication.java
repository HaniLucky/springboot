package com.xxx.example;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <P>Description: SpringBoot启动类相关信息</P>
 * @ClassName: StarterApplication
 * @author 胡良俊  2018年1月27日下午12:08:07
 * 
 */
@SpringBootApplication
public class StarterApplication {
	
	public static void main(String[] args) {
		//SpringApplication.run(StarterApplication.class, args);  // 带图标启动
		
		//----- start不带图标启动 -----
		SpringApplication application = new SpringApplication(StarterApplication.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
		//-----  end 不带图标启动 -----
		
	}

}
