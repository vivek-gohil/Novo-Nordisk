package com.novonordisk.main;

import com.novonordisk.domain.Account;

public class AccountMain {
	public static void main(String[] args) {

		// Create object and set values using constructor
		// Print values using getter
		Account account = new Account(101, "Novo Nordisk", 1000);

		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());

		System.out.println("-------------------");

		// Create object and set values using setter
		// Print values usign getter
		Account account2 = new Account();
		account2.setAccountNumber(102);
		account2.setName("Vivek Gohil");
		account2.setBalance(1000);

		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());

	}
}
