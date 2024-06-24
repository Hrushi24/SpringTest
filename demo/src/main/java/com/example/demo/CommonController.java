package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	public static void main(String[] args) {
		

	}
	@RequestMapping("/")
	public String home() 
	{
		return "home";
	}
	
	@RequestMapping("/about")
	public String first() 
	{
		return "about";
	}

}
