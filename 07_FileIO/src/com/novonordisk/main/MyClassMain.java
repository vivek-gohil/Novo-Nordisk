package com.novonordisk.main;

import com.novonordisk.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		System.out.println(myClass.getData()); // null
		
		int [] numbers = new int[3];
		numbers[0] = 23;
		numbers[1] = 22;
		numbers[2] = 21;
		
		myClass.setData(numbers);
		
		//System.out.println(myClass.getData());
		for(int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		System.out.println("Values from class"); //23,22,21
		for(int i : myClass.getData()) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		System.out.println("Changin array of main");
		numbers[1] = 100;
		System.out.println("---------------------");
		System.out.println("Values from class"); //23,22,11
		for(int i : myClass.getData()) {
			System.out.println(i);
		}
		System.out.println("Values from main"); //23,100,21
		for(int i : numbers) {
			System.out.println(i);
		}
	}
}
