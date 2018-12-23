package com.lasantha.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("home")
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model){
		model.addAttribute("message", "Welcome to EE");
		return "hello";
	}
	
}
