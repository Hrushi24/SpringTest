package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@Controller
//@ResponseBody
@RestController
//@RequestMapping("user")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	}
	
	@RequestMapping("/test")
	public String firstControl() 
	{
		return "First controller...... hrushikesh";
	}
	
//	@RequestMapping("/")
//	public String home() 
//	{
//		return "<h1>This is Home Page...</h1>";
//	}
	
	@RequestMapping("/firstPage")
	public String first() 
	{
		return "<h1>This is <font color='red'>first Page</font>...</h1>";
	}
	
	@RequestMapping("/secondPage")
	public String second() 
	{
		return "<h1>This is <font color='green'>Second Page</font>...</h1>";
	}
	
	@RequestMapping("/firstPage/child")
	public String child() 
	{
		return "<h1>This is <font color='blue'>Child Page</font>...</h1>";
	}
	

}
