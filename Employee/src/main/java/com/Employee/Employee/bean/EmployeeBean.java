package com.Employee.Employee.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class EmployeeBean {

	@Id
	private long id;
	private String name;
	
	public EmployeeBean() {
		super();
	}

	public EmployeeBean(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + "]";
	}

}