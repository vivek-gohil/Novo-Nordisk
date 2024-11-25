package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.LoginDetails;

public class LoginDetailsMain {
	public static void main(String[] args) {
		// 1. Declare variables
		String username, password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");
		username = scanner.next();
		System.out.println("Enter password");
		password = scanner.next();

		LoginDetails loginDetails = new LoginDetails();
		boolean result = loginDetails.validate(username, password);
		System.out.println(result);
		if (result == true)
			System.out.println("Login Successfull");
		else
			System.out.println("Login Failed");

	}
}
