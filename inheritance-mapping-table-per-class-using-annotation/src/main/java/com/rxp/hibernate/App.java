package com.rxp.hibernate;

import java.util.Date;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.rxp.hibernate.domain.Employee;
import com.rxp.hibernate.domain.Student;
import com.rxp.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App{
	public static Logger logger = Logger.getLogger(App.class);
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) {
    	Session session = HibernateUtil.getSession();
    	Employee employee = new Employee("Niranjan", "Maharana", 100000000, new Date("11/28/2016"), 10, "IT");
    	Integer employeeId = (Integer) session.save(employee);
    	session.beginTransaction().commit();
    	System.out.println("Employee created with id : " + employeeId);
    	
    	Employee storedEmployee = (Employee) session.get(Employee.class, employeeId);
    	System.out.println("Stored Employee Details : " + storedEmployee);
    	
    	Student student = new Student("Niranjan", "Maharana", "IT", 5000);
    	Integer studentId = (Integer) session.save(student);
    	session.beginTransaction().commit();
    	System.out.println("Student created with id : " + studentId);
    	
    	Student storedStudent = (Student) session.get(Student.class, studentId);
    	System.out.println("Stored Student Details : " + storedStudent);
    }
}