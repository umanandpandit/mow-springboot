package com.niit.foodorder.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;



@Entity
@Table(name="customer")
public class Customer {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="phone")
	private String phone;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [phone=" + phone + ", name=" + name + ", password=" + password + ", address=" + address + "]";
	}


	
	
}
