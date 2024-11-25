package com.novonordisk.domain;

public class LoginDetails {
	public boolean validate(String username, String password) {
		if (
				username.equals("admin") 
				&& 
				password.equals("admin@123")
			)
			return true;
		else
			return false;
	}
}
