package com.user.service;

import java.util.List;
import com.user.entity.User;

 
@org.springframework.stereotype.Service
public class UserServiceImpl implements Service {
	
	
 static List<User> list = List.of(
			new User(1,"sonu","975345678"),
			new User(2,"Monu","975345678"),
			new User(3,"Tony","975345678"),
			new User(4,"onu","975345678"),
			new User(11,"sony","975345678"),
			new User(21,"Monty","975345678"),
			new User(113,"suresh","975345678"),
			new User(14,"ramesh","975345678")
			);
	
	
	
	@Override
	public User getUser(int id) {
		 User user2 = this.list.stream().filter( user -> user.getId()==id).findFirst().get();
	
		 return user2;

}

	public List<User> getUsers()
	{
		return list;
	}
	
	public User getUserbyid(int id)
	{
		User user=this.list.stream().filter(  u -> u.getId()==id ).findFirst().get();
		System.out.println(user);
		return user;
	}
}