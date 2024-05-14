package com.thymeleaf.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentController {

	//Handler for include fragment example
	@GetMapping("/replacefragment")
	public String includeFragmentHandler() {
		return "replacefragment";
	}
	
	
	//Handler for insert fragment example
		@GetMapping("/insertfragment")
		public String insertFragmentHandler() {
			return "insertfragment";
		}
		
//		//Handler for include fragment example
//				@GetMapping("/includefragment")
//				public String includefragmentHandler() {
//					return "includefragment";
//				}
				
				
				//Handler for include fragment passin dynamic value example
				@GetMapping("/includefragment")
				public String includefragmentHandler(Model model) {
					model.addAttribute("title","I like to eat samosa");
					model.addAttribute("subtitle",LocalDateTime.now().toString());
					return "includefragment";
				}
				
	
				//Hndler for inheritance example in thymeleaf
	@GetMapping("/about")
	public String aboutHandler() {
		return "about";
		}
	
	@GetMapping("/content")
	public String contentHandler() {
		return "content";
		}
	
	
}
