package com.novonordisk.domain;

public class Addition {
	public void accept(int n1,int n2) {
		System.out.println("In Addition Class");
		System.out.println("accept() called");
		System.out.println(n1);
		System.out.println(n2);
		
		int result = n1 + n2;
		System.out.println("Addition is " + result );
		
	}
}
