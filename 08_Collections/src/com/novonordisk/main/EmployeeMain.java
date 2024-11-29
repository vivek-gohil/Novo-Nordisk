package com.novonordisk.main;

import java.util.HashSet;

import com.novonordisk.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {

		Employee employee1 = new Employee(101, "Employee 1", 10000);
		Employee employee2 = new Employee(102, "Employee 2", 10000);
		Employee employee3 = new Employee(103, "Employee 3", 10000);

		HashSet<Employee> employeeSet = new HashSet<Employee>();

		System.out.println(employeeSet);

		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		
		System.out.println(employeeSet);
		for(Employee i : employeeSet) {
			System.out.println(i.getEmployeeId() + " " + i.getName()  + " " + i.getSalary()) ;
		}
	}
}

