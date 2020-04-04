package com.niit.foodorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.foodorder.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	

	List<Customer> findByPhoneAndPassword(String phone, String password);

}
