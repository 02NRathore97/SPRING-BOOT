package com.jwt.authentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/welcome")
	public String welcome() {
		String text="This is private page ";
		text+="This page is not allowed to unauthenticated user";
		return text;
	}
}
