package com.offcn.spring.demo1;

import org.springframework.stereotype.Controller;
/*
 *	 页面跳转使用@controller注解
 * */
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JumpController {
	@RequestMapping("/index")
	public String getIndex() {
		return "index1.jsp";
	}
}
