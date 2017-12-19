package com.covet.springboot.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** 配置类 
 * Configuration   声明当前类是一个配置类
 * ComponentScan("com.covet.springboot.service")  // 自动扫描包名下的
 * 		@Service @Component @Repository @Controller 的类,并注册为Bean
 */
@Configuration
@ComponentScan("com.covet.springboot.service")
public class Config {

}
