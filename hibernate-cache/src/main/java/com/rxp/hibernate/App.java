package com.rxp.hibernate;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.rxp.hibernate.domain.Department;
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
    	//getDepartmentsWithDifferentSession(session);
    	getDepartmentsWithSameSession(session);
    }
    
    public static void getDepartmentsWithSameSession(Session session){
    	Department department = (Department) session.get(Department.class, 1);
		System.out.println(department);
		
		Department department2 = (Department) session.get(Department.class, 1);
		System.out.println(department2);
    }
    
    public static void getDepartmentsWithDifferentSession(Session session){
    	getDepartments(session);
    	System.out.println("\n::::: Executing same query again with different session :::::");
    	getDepartments(session);
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