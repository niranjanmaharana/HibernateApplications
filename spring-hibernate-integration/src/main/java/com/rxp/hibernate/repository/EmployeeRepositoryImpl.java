package com.rxp.hibernate.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rxp.hibernate.domain.Department;
import com.rxp.hibernate.domain.Employee;
import com.rxp.hibernate.repository.util.HibernateUtil;

public class EmployeeRepositoryImpl extends HibernateUtil implements EmployeeRepository{
	
	public EmployeeRepositoryImpl() {}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployees(){
		List<Employee> employees = null;
		Session session = getSession();
		try{
			employees = session.createQuery("from Employee e").list();
			return employees != null ? employees : new ArrayList<Employee>();
		}catch(Exception exception){
			System.out.println(exception.getMessage());
		}
		return null;
	}
	
	@Override
	public Employee insertEmployee(Employee employee){
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Serializable serializable = session.save(employee);
		transaction.commit();
		return (Employee) session.get(Employee.class, serializable);
	}
	
	@Override
	public Department insertDepartment(Department department){
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Serializable serializable = session.save(department);
		transaction.commit();
		return (Department) session.get(Department.class, serializable);
	}
}