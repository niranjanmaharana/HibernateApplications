package com.rxp.hibernate.repository;

import java.util.List;

import com.rxp.hibernate.domain.Employee;

public interface EmployeeRepository {

	public List<Employee> getAllEmployee();
}