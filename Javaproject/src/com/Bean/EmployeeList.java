package com.Bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeList {

	List<Employee> employeelist = new ArrayList<>();

	public void addEmployee(Employee employee) {
		employeelist.add(employee);
	}

	public void removeEmployeeId(int id, String name) {
		for (Iterator iterator = employeelist.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getEmpId() == id || employee.getName().equals(name)) {
				iterator.remove();
			}

		}
	}

	public void showEmployeeList() {
		for (Employee employee : employeelist) {
			System.out.println(employee.getEmpId() + " " + employee.getName() + " " + employee.getSalary());

		}
	}

	public void searchEmployeeName(String name) {
		for (Employee employee : employeelist) {
			if (employee.getName().equals(name)) {
				System.out.println(employee.getName());
				System.out.println(employee.getEmpId() + " " + employee.getSalary());

			}
		}
	}

	public Employee highestSalary() {
		int maxsal = 0;
		Employee maxvalue = null;
		for (Employee employee : employeelist) {
			if (employee.getSalary() > maxsal) {
				maxsal = employee.getSalary();
				maxvalue = employee;
			}
		}
		return maxvalue;
	}

	public static void main(String[] args) {

		EmployeeList employee = new EmployeeList();
		Employee e1 = new Employee(01, "krithi", 900000);
		Employee e2 = new Employee(02, "ramyaa", 88888);
		Employee e3 = new Employee(03, "Priya", 67799);
		Employee e4 = new Employee(04, "krithi", 878788);

		employee.addEmployee(e1);
		employee.addEmployee(e2);
		employee.addEmployee(e3);
		employee.addEmployee(e4);

		// employee.removeEmployeeId(05, "krithi");
		System.out.println();
		employee.showEmployeeList();

		System.out.println();

		employee.searchEmployeeName("krithi");
		System.out.println();

		System.out.println("Highest salary:" + employee.highestSalary().getName());
		System.out.println(employee.highestSalary().getEmpId() + " " + employee.highestSalary().getSalary());

	}
}
