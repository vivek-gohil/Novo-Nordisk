package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.EmployeeCRUD;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		EmployeeCRUD employeeCRUD = new EmployeeCRUD();

		int employeeId;
		String name;
		double salary;
		Scanner scanner = new Scanner(System.in);

		employeeCRUD.getAllEmployees();
		System.out.println("-----------------------");
		//Delete
		System.out.println("Enter employeeId to be deleted");
		employeeId = scanner.nextInt();
		employeeCRUD.deleteEmployee(employeeId);
		System.out.println("-----------------------");
		employeeCRUD.getAllEmployees();
		
		
//		// Update
//		System.out.println("Enter employeeId to be updated");
//		employeeId = scanner.nextInt();
//		System.out.println("Enter new name");
//		name = scanner.next();
//		System.out.println("Enter new salary");
//		salary = scanner.nextDouble();
//
//		employeeCRUD.updateEmployee(employeeId, name, salary);
		System.out.println("-----------------------");
		employeeCRUD.getAllEmployees();

		// Insert new employee
//		System.out.println("Enter employeeId");
//		employeeId = scanner.nextInt();
//		System.out.println("Enter name");
//		name = scanner.next();
//		System.out.println("Enter salary");
//		salary = scanner.nextDouble();
//		
//		employeeCRUD.createEmployee(employeeId, name, salary);
//		
//		System.out.println("------------------------");
//		
//		employeeCRUD.getAllEmployees();
//		
		// Select one employee
		// System.out.println("Enter EmployeeId");
		// employeeId = scanner.nextInt();
		// employeeCRUD.getEmployeeByEmployeeId(employeeId);

	}
}
