package com.novonordisk.main;

public class ForLoopMain {
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		// Print all odd numbers between 1 to 100
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
