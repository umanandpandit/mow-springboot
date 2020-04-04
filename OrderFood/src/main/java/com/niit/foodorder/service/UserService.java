package com.niit.foodorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.foodorder.model.User;



@Service
@Transactional
public class UserService {

	
	
	@Autowired
	private UserService repo;
	

	 public void save (User user) {
		 repo.save(user);
		 
	 }
	
	 public void delete(long id) {
		 repo.delete(id);
	 }
}