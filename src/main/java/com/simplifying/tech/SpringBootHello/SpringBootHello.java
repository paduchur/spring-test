package com.simplifying.tech.SpringBootHello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHello {
	
	@GetMapping("/springBootHello")
	private String SpringBootHello(){
		
		return "Welcome to Simplifying Tech , SPring Boot App !!!";
	}

}
