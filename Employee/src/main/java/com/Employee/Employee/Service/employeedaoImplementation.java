package com.Employee.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Employee.Employee.Repositary.EmployeeJpaRepo;
import com.Employee.Employee.bean.EmployeeBean;

@Service
@Configuration
public class employeedaoImplementation implements Employeedao {
	@Autowired
	private EmployeeJpaRepo jpaRepo;

	@Override
	public EmployeeBean addEmployee(EmployeeBean employeeBean) {

		EmployeeBean saveEmployee = jpaRepo.save(employeeBean);
		return saveEmployee;

	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		List<EmployeeBean> getEmployees = jpaRepo.findAll();
		return getEmployees;

	}

	public EmployeeBean getEmpById(Long empid) {
		
		return jpaRepo.findById(empid).get();
	}

}
