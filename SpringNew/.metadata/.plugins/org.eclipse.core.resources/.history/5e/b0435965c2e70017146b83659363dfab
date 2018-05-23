package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {

		System.out.println("reached");
		model.addAttribute("name", "John Doe");

		return "welcome";
	}

	@RequestMapping("/welcome")
	public ModelAndView  welcomeMethod(Model model) {

		ModelAndView mv = new ModelAndView();
		
		System.out.println("reached");
		
		model.addAttribute("name","John Doe");
		mv.setViewName("welcome");
		return mv;
	}
	
}