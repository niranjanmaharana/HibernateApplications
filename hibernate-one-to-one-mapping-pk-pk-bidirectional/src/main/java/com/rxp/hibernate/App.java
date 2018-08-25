package com.rxp.hibernate;

import java.io.Serializable;

import org.hibernate.Session;

import com.rxp.hibernate.domain.Address;
import com.rxp.hibernate.domain.Person;
import com.rxp.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	Session session = HibernateUtil.getSession();
    	Person person = new Person("Niranjan", 24);
    	Address address = new Address("WL-47", "Odisha", "India", person);
    	Serializable serializable = session.save(address);
    	session.beginTransaction().commit();
    	System.out.println("Object saved with ID : " + serializable);
    	
    	Address storedAddress = (Address) session.get(Address.class, serializable);
    	System.out.println("Saved Address : " + storedAddress);
    }
}