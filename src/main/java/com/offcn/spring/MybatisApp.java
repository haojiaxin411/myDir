package com.offcn.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * 	@SpringBootApplication= @MapperScan("com.offcn.spring.dao")
 * 							+ @ComponentScan
 * 							+ @EnableAutoConfiguration
 * */

//扫描dao
@MapperScan("com.offcn.dao")
//扫描service controller
//@ComponentScan
//扫描Autowired  依赖注入
//@EnableAutoConfiguration
@SpringBootApplication
public class MybatisApp {
	public static void main(String[] args) {
		//args中存放的就是在main方法中执行的所有方法的参数
		SpringApplication.run(MybatisApp.class, args);
	}
}
