package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Account;

public class AccountMain {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your account number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter your name");
		name = scanner.next();
		System.out.println("Enter balance");
		balance = scanner.nextDouble();
		
		Account account = new Account();
		account.display(accountNumber, name, balance);
		
	}
}
