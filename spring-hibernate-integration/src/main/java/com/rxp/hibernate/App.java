package com.rxp.hibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rxp.hibernate.repository.EmployeeRepository;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
    	/*Department department = new Department("CSE");
    	department = employeeRepository.insertDepartment(department);
    	Employee employee = new Employee("Niranjan", 120000000, department);
    	employee = employeeRepository.insertEmployee(employee);
    	System.out.println("Employee saved : " + employee);*/
    	System.out.println(employeeRepository);
    	System.out.println("List Employee : " + employeeRepository.getEmployees());
    	context.close();
    }
}