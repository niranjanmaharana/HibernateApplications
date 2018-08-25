package com.rxp.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
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
    	//getAllEmployee(session);
    	//getEmployeeNames(session);
    	//getEmployeeNameSalary(session);
    	//getEmployeeDeptDetails(session);
    	getDepartments(session);
    }
    
    public static void getAllEmployee(Session session){
    	SQLQuery query = session.createSQLQuery("select * from employee");
		query.addEntity(Employee.class);
		@SuppressWarnings("unchecked")
		List<Employee> employees = query.list();
		for(Employee employee : employees)
			System.out.println(employee);
    }
    
    public static void getEmployeeNames(Session session){
    	SQLQuery query = session.createSQLQuery("select empName from employee");
		@SuppressWarnings("unchecked")
		List<Object> employeeNames = query.list();
		for(Object employeeName : employeeNames)
			System.out.println(employeeName);
    }
    
    public static void getEmployeeNameSalary(Session session){
    	SQLQuery query = session.createSQLQuery("select empName, salary from employee");
		@SuppressWarnings("unchecked")
		List<Object[]> employeeNames = query.list();
		for(Object[] employeeName : employeeNames)
			System.out.println(employeeName[0] + " : " + employeeName[1]);
    }
    
    public static void getEmployeeDeptDetails(Session session){
    	SQLQuery query = session.createSQLQuery("select e.empNo, e.empName, e.salary, d.deptName from employee e inner join department d on(e.deptNo = d.deptNo)");
		@SuppressWarnings("unchecked")
		List<Object[]> employeeNames = query.list();
		System.out.println("Emp No\tSalary\tDept\tEmpName");
		for(Object[] employeeName : employeeNames)
			System.out.println(employeeName[0] + "\t" + employeeName[2] + "\t" + employeeName[3] + "\t" + employeeName[1]);
    }
    
    public static void getEmployeeDetails(Session session){
    	SQLQuery query = session.createSQLQuery("select empNo, empName, salary, d.deptName from employee e inner join department d on(e.deptNo = d.deptNo)");
		@SuppressWarnings("unchecked")
		List<Object[]> employeeNames = query.list();
		System.out.println("Emp No\tSalary\tDept\tEmpName");
		for(Object[] employeeName : employeeNames)
			System.out.println(employeeName[0] + "\t" + employeeName[2] + "\t" + employeeName[3] + "\t" + employeeName[1]);
    }
    
    public static void getDepartments(Session session){
    	SQLQuery query = session.createSQLQuery("select * from department");
		query.addEntity(Department.class);
		@SuppressWarnings("unchecked")
		List<Department> departments = query.list();
		for(Department department : departments)
			System.out.println(department);
    }
}