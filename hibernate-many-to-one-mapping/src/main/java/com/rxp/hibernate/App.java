package com.rxp.hibernate;

import java.io.Serializable;

import org.hibernate.Session;

import com.rxp.hibernate.domain.Department;
import com.rxp.hibernate.domain.Employee;
import com.rxp.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Department department = new Department("CSE");
		Serializable deptNo = session.save(department);
		session.beginTransaction().commit();
		System.out.println("Department saved with deptNo : " + deptNo);
		department.setDeptNo((Integer)deptNo);
    	Employee employee = new Employee("Niranjan", 30L, department);
    	Serializable empNo = session.save(employee);
    	session.beginTransaction().commit();
    	System.out.println("Employee saved with empNo : " + empNo);
	}
}