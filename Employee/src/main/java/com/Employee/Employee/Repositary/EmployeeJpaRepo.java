package com.Employee.Employee.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.Employee.bean.EmployeeBean;

import jakarta.transaction.Transactional;

public interface EmployeeJpaRepo extends JpaRepository<EmployeeBean, Long>{

}
