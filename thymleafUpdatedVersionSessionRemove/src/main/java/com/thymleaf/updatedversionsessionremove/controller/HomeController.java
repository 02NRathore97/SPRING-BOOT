package com.thymleaf.updatedversionsessionremove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/home")
public class HomeController {
		@RequestMapping("/")
		public String home(Model model,HttpSession session) {
			session.setAttribute("message", "This is session Method");
			return "home";
		}
		
		@RequestMapping("/about")
		public String about() {
			return "about";
		}
		
		@RequestMapping("/services")
		public String services() {
			return "services";
		}
	
}
