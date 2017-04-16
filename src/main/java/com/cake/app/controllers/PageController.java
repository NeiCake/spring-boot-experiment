package com.cake.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/")
	String home() {
		return "app.homepage";
	}
	
	@RequestMapping("/about")
	String about() {
		return "app.about";
	}
	
	@RequestMapping("/test")
	String test(){
		return "app.test";
	}
	
	@RequestMapping("/addstatus")
	String addStatus(){
		return "app.addstatus";
	}
}
