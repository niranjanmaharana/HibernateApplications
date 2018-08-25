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
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSession();
		Department department = new Department(1, "CSE");
		Serializable deptNo = session.save(department);
		session.beginTransaction().commit();
		System.out.println("Department saved with deptNo : " + deptNo);
		Employee employee = new Employee("Krishna", 312000000, department);
    	Serializable empNo = session.save(employee);
    	session.beginTransaction().commit();
    	System.out.println("Employee saved with empNo : " + empNo);
    }
}
