package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.Account;

public class AccountMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		int choice;
		double amount;
		boolean result;
		String continueChoice;

		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();
		System.out.println("Enter name");
		name = scanner.next();
		System.out.println("Enter balance");
		balance = scanner.nextDouble();

		Account account = new Account(accountNumber, name, balance);

		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You have selected Withdraw");
				System.out.println("Enter amount");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result == true)
					System.out.println("Withdraw successfull");
				else
					System.out.println("Withdraw failed");
				break;
			case 2:
				System.out.println("You have selected Deposit");
				System.out.println("Enter amount");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if (result == true)
					System.out.println("Deposit successfull");
				else
					System.out.println("Deposit failed");
				break;
			case 3:
				System.out.println("You have selected Check Balance");
				System.out.println("Balance = " + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue? y || n ");
			continueChoice = scanner.next();
		} while (continueChoice.equals("y"));
		System.out.println("Thank you");
	}
}
