package com.novonordisk.domain;

public class User implements Greet, Display {

	@Override
	public void print() {
		System.out.println("User class print()");
	}

	@Override
	public void doGreet() {
		System.out.println("Good Afternoon");
	}

}
