package com.niit.foodorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.foodorder.model.Customer;
import com.niit.foodorder.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	
	
	@Autowired
	private CustomerRepository repo;
	

	 public void save (Customer customer) {
		 repo.save(customer);
		 
	 }
	/*
	 public void delete(long id) {
		 repo.deleteById(Long id);
	 }*/


	public List<Customer> findByPhoneAndPassword(String phone, String password) {
		// TODO Auto-generated method stub
		return repo.findByPhoneAndPassword(phone,password);
	}
}