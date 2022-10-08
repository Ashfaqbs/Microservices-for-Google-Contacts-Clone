package com.contact.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class Contact_ServiceImpl  implements ContactService{

	static List<Contact> list  =List.of(
			new Contact(101,"sonu@gmail.com","Sonu",1),
			new Contact(102,"ramesh@gmail.com","Sonu",1),
			new Contact(103,"monu@gmail.com","Sonu",3),
			new Contact(104,"sony@gmail.com","Sonu",3),
			new Contact(105,"tony@gmail.com","Sonu",21),
			new Contact(106,"suresh@gmail.com","Sonu",21)			
			);


	@Override
	public List<Contact> getContacts(int id) {
		List<Contact > list1 = new ArrayList<>();
		this.list.stream( ).filter(  c -> c.getUserId()==id ).forEach( e -> list1.add(e)  );
		return list1;
	}

	







}
