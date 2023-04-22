package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.model.Employee;

public interface IEmployeeService {
	
public Integer saveEmpolyee(Employee e);
public List<Employee> getallEmployee();
public Integer removeEmployee(Integer id);
public Employee editEmployee(Integer id);
void updateEmployee(Employee e);

Page<Employee> getallEmployee(Pageable pageable);
}
