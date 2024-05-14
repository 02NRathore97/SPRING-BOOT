package com.spring.springboot.devtool.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContoller {
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a = 6;
		int b = 10;
		return "sum is = "+(a+b);
	}
}
