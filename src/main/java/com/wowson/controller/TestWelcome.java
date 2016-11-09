package com.wowson.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestWelcome {
	protected static Logger logger = Logger.getLogger(TestWelcome.class);
	@RequestMapping("/")
	public String test(){
		System.out.println("里面成功");
		return "index";
	}
}
