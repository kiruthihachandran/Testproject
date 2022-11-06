package com.Bean;

public class Employee {
	private int empId;
	private String name;
	private int salary;
	private String cabin;

	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	@Override

	public String toString() {
		return empId + " " + name + " " + salary;

	}

}
