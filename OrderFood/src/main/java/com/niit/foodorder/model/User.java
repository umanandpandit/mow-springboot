package com.niit.foodorder.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class User {
	@Id
	@Column(name="phone")
	private String phone;
	
	@Column(name="password")
	private String password;


	public User() {
		super();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = password;
		String encodedString = encoder.encodeToString(
		normalString.getBytes(StandardCharsets.UTF_8) );
		this.password = encodedString;
	}

	@Override
	public String toString() {
		return "User [phone=" + phone + ", password=" + password + "]";
	}


}
