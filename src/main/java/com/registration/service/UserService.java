package com.registration.service;

import java.util.List;

import com.registration.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public void saveAdmin(User user);
	 public List<User> findAll();
	        // TODO Auto-generated method stub
	       
	    
	
	
}