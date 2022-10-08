package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.Contact_ServiceImpl;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private Contact_ServiceImpl contact_ServiceImpl;
	@GetMapping("/{id}")
	public List<Contact> getContacts(@PathVariable("id") int id)
	{

		return 	this.contact_ServiceImpl.getContacts(id);
	}

	
	
	

}
