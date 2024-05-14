package com.formvalidation.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	
	//Attributes
	@NotBlank(message="Username can not be null")
	@Size(min=3, max=20, message="Username must be between 3-20 charactors ! ")
	private String username;
	
	
	@NotBlank(message="Email can not be null")
	//@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid Eamil")
	@Email
	private String email;
	
	
	//Getter Setter
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//toStirng method
	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + "]";
	}
	
	
	
	
}
