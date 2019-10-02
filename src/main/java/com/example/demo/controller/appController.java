package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class appController {

	@ResponseBody	
	@RequestMapping("/home")	
		
	public String welcome() {
			return "Wecome There";
		}
		
	@RequestMapping("/welcome")
	public String Welcome() {
		return "welcomepage";
	}	
	
}

