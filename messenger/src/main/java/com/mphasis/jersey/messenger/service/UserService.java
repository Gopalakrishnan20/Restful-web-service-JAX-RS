package com.mphasis.jersey.messenger.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.mphasis.jersey.messenger.domain.User;

public class UserService {
	
	private static Map<Integer,User> map=new HashMap<>();
	
	static {
		User u1=new User(11,"Gopalakrishnan","Cybertron","gk@gmail.com","9952658175",new Date(2000,07,20));
		User u2=new User(12,"Gopi","tron","gopi567890@gmail.com","9952658175",new Date(2000,07,21));
		User u3=new User(13,"Krishna","GK","gk@root.com","9952658175",new Date(2000,07,22));
		
		map.put(u1.getUserId(), u1);
		map.put(u2.getUserId(), u2);
		map.put(u3.getUserId(), u3);
	}
	
	public Collection<User> getAllUsers(){
		return map.values();
	}
	
	public User getUserById(int userId) {
		return map.get(userId);
	}
	
	public boolean deleteUserById(int userId) {
		if(map.containsKey(userId)) {
			map.remove(userId);
			return true;
		}
		return false;
	}
	
	public boolean updateUserById(int userId,User newData) {
		if(map.containsKey(userId)) {
			map.put(userId, newData);
			return true;
		}
		return false;
	}
	
	public boolean addUser(User user) {
		return map.put(user.getUserId(), user)==user;
	}

}
