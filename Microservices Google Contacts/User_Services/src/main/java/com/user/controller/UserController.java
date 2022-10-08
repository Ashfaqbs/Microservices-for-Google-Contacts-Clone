package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl impl;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") int id)
	{
		User userbyid = this.impl.getUserbyid(id);
		//http://localhost:9002/contacts/1
		List list = this.restTemplate.getForObject("http://contact-service/contacts/"+id, List.class);
		userbyid.setContacts(list);
		System.out.println(userbyid);
		return userbyid;
	}

}
