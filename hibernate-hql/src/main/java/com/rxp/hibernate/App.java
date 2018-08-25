package com.rxp.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.rxp.hibernate.domain.Employee;
import com.rxp.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App{
	@SuppressWarnings("unchecked")
	public static void main( String[] args ) {
    	Session session = HibernateUtil.getSession();
		Query query = session.getNamedQuery("findEmployeeByDeptNo");
		query.setParameter("deptNo", 10);
		List<Employee> employees = query.list();
		System.out.println("List of employees : ");
		System.out.println(employees);
    }
}