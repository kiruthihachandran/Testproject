package com.Employee.Employee.Service;

import java.util.List;

import com.Employee.Employee.bean.EmployeeBean;

public interface Employeedao {
	public  EmployeeBean addEmployee(EmployeeBean employeeBean);
	public List<EmployeeBean> getAllEmployee();

}
