package com.offcn.spring.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	/*
	 * 	默认端口tomcat是8080
	 * 
	 * */
	@RequestMapping("/hello")
	public String index() {
		return "hello world";
	}
}
