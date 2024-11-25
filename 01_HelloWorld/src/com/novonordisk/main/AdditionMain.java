package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Addition;

public class AdditionMain {
public static void main(String[] args) {
	System.out.println("AdditionMain start");
	
	//Declaration
	int n1;
	int n2;
	
	//Use Scanner to accept values from user
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number1");
	n1 = scanner.nextInt();
	System.out.println("Enter number2");
	n2 = scanner.nextInt();
	
	//Create object of Addition class and call accept function
	Addition addObject = new Addition();
	addObject.accept(n1, n2);
	
	System.out.println("AdditinMain end");
}
}
