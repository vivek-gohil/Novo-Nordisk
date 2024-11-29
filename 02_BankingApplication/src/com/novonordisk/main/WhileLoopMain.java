package com.novonordisk.main;

import java.util.Scanner;

public class WhileLoopMain {
	public static void main(String[] args) {

//		int i = 1;
//		
//		while(i<10) {
//			System.out.println(i);
//			i = i + 1;
//		}
//		System.out.println("Outside of loop");

		// Accept number from user
		// Print multiplication table
		int number;
		int i = 1;
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		number = scanner.nextInt();
		while (i <= 10) {
			result = number * i;
			System.out.println(number + " * " + i + " = " + result);
			i = i + 1;
		}

	}
}
