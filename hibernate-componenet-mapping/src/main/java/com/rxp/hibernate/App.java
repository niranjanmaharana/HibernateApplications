package com.rxp.hibernate;

import java.io.Serializable;

import org.hibernate.Session;

import com.rxp.hibernate.domain.Address;
import com.rxp.hibernate.domain.Employee;
import com.rxp.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args){
    	Session session = HibernateUtil.getSession();
    	Address address = new Address("Odisha", "Ganjam");
    	Employee employee = new Employee("Kalpana", 35L, address);
    	Serializable serializable = session.save(employee);
    	session.beginTransaction().commit();
    	System.out.println("Employee saved with ID : " + serializable);
    	
    	Employee employee2 = (Employee)session.get(Employee.class, serializable);
    	System.out.println("Stored Employee : " + employee2);
    }
}