package com.rxp.hibernate.repository;

import java.util.List;

import com.rxp.hibernate.domain.Department;
import com.rxp.hibernate.domain.Employee;

public interface EmployeeRepository {

	public List<Employee> getEmployees();

	public Employee insertEmployee(Employee employee);

	public Department insertDepartment(Department department);
}