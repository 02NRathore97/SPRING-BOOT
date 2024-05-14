package com.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	//Simple Thymeleaf Example
	@GetMapping({"/","/hello"})
	public String hello(@RequestParam(value="name",defaultValue = "World",required = true) String name,Model model) {
		model.addAttribute("name",name);
		model.addAttribute("lastname","Rathore");
		return "hello";
		}
	
	//Iteration in Thymeleaf Example
	@GetMapping("/iterate")
	public String iterateHandler(Model model) {
		//Create a list, set or any collection
		List<String> names = List.of("Neeraj","Amit","Vinod");
		model.addAttribute("names", names);
		return "iterate";
		}
	
	//Elvis Condition in Thymeleaf Example
	@GetMapping("/elviscondition")
	public String elvisconditionHandler(Model model) {
		model.addAttribute("isActive",true);
		return "elviscondition";
	}
	
	//ifUnless Condition in Thymeleaf Example
		@GetMapping("/ifunlesscondition")
		public String ifunlessconditionHandler(Model model) {
			model.addAttribute("gender","M");			
			return "ifunlesscondition";
		}
		
		//switchcase in Thymeleaf Example
		@GetMapping("/switchexample")
		public String switchHandler(Model model) {
			//List<Integer> list = List.of(101,102,103,104,105);
			//List<Integer> list = List.of(101,102);
			List<Integer> list = List.of();
			model.addAttribute("list", list);
			return "switchexample";
		}
	
}
