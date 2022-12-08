package com.Employee.Employee.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Employee.Service.Employeedao;
import com.Employee.Employee.Service.employeedaoImplementation;
import com.Employee.Employee.bean.EmployeeBean;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private employeedaoImplementation daoImplementation;

	@PostMapping("/insert")
	public ResponseEntity<EmployeeBean> addEmployee(@RequestBody EmployeeBean employee) {
		EmployeeBean saveEmployee = daoImplementation.addEmployee(employee);
		return new ResponseEntity<EmployeeBean>(saveEmployee, HttpStatus.CREATED);
	}
    @GetMapping("/ListAllEmployee")
	public ResponseEntity<List<EmployeeBean>> getAllEmployee() {
		List<EmployeeBean> getEmployees = daoImplementation.getAllEmployee();
		return new ResponseEntity<List<EmployeeBean>>(getEmployees, HttpStatus.OK);
		

	}
    @GetMapping("/emp/{empid}")
   	public ResponseEntity<EmployeeBean> getEmpById(@PathVariable("empid")Long empid) {
   		EmployeeBean empRetrived = (EmployeeBean) daoImplementation.getEmpById(empid);
   		return new ResponseEntity<EmployeeBean>(empRetrived, HttpStatus.OK);
   		

   	}

}
