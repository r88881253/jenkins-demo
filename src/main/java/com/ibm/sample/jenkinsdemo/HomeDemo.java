package com.ibm.sample.jenkinsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeDemo {
	

	@RequestMapping(value="/home")
	public String home(){
		return "Hello IBM";
	}
	
}
