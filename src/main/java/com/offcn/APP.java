package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.offcn.dao")
@SpringBootApplication
public class APP {
	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}
}
