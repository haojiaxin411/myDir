package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductorController {
	@Autowired
	private JmsMessagingTemplate template;
	@RequestMapping("/send")
	 public void sentMessage(String message) {
		 template.convertAndSend("java0218",message);
	 }
}
