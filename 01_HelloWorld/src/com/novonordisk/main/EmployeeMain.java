package com.novonordisk.main;

import com.novonordisk.domain.Employee;

public class EmployeeMain {
	public static void main(String args[]) {
		System.out.println("EmployeeMain start");
		
		Employee employee = new Employee();
		employee.employeeId = 101;
		
		System.out.println("EmployeeMain end");
	}
}
