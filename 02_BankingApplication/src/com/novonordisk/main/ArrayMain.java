package com.novonordisk.main;

public class ArrayMain {
	public static void main(String[] args) {
		//Fixed in size
		int[] numbers = new int[5];
		numbers[0] = 99;


		// System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);

		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		//For each - Use with Arrays only - Read Only 
		for(int i : numbers) {
			System.out.println(i);
		}
	}
}
