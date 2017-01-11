package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		String message="Hello SpringMVC ";
		return new ModelAndView("hellopage", "message", message);
		
	}

}
