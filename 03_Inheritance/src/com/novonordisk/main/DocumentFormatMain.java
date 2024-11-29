package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.CSV;
import com.novonordisk.domain.DocumentFormat;
import com.novonordisk.domain.JSON;
import com.novonordisk.domain.PDF;
import com.novonordisk.domain.XLS;

public class DocumentFormatMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DocumentFormat documentFormat = null;

		int choice;
		System.out.println("Choose your format");
		System.out.println("1. PDF");
		System.out.println("2. XLS");
		System.out.println("3. CSV");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			documentFormat = new PDF();
			break;
		case 2:
			documentFormat = new XLS();
			break;
		case 3:
			documentFormat = new CSV();
			break;
		case 4:
			documentFormat = new JSON();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		documentFormat.downloadDocument();
	}
}
