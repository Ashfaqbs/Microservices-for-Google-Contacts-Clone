package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	
	@GetMapping("/userservicefallback")
	public String userServiceFallBack()
	{
		
		return "User Service is down please try again Later";
	}
	
	
	
	@GetMapping("/contactservicefallback")
	public String contactServiceFallBack()
	{
		
		return "contact Service is down please try again Later";
	}
	
	
	
	

}
