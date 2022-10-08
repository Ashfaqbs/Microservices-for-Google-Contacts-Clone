package com.user.entity;

public class Contact {
	
	
	private int id;
	
	private String email;
	
	private String name;
	
	private int userId;

	public Contact(int id, String email, String name, int userId) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.userId = userId;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
