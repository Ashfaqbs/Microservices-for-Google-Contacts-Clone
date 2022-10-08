package com.contact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public interface ContactService {
	  
	
	List<Contact> getContacts(int id);

}
