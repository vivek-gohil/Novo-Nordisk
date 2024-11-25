package com.novonordisk.main;

import java.util.Scanner;

public class UserDetailsMain {
	public static void main(String[] args) {
		String name;
		int age;
		System.out.println("Enter your name");

		// Creating Object of Scanner Class
		Scanner scanner = new Scanner(System.in);

		// Accept value from user and store in name variable
		name = scanner.next();

		System.out.println("Name = " + name);

		System.out.println("Enter your age");
		age = scanner.nextInt();

		System.out.println("Age = " + age);
	}
}
