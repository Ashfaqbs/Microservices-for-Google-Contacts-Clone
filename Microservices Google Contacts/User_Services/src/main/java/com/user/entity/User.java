package com.user.entity;
import java.util.*;
public class User {


	private int id;
	
	private String name;
	
	private String phone;
	
	private List<Contact> contacts= new ArrayList<>();

	public User(int id, String name, String phone, List<Contact> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public User(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	

}
