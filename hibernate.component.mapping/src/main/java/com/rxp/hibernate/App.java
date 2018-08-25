package com.rxp.hibernate;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.rxp.hibernate.domain.Address;
import com.rxp.hibernate.domain.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) {
    	Configuration configuration = new Configuration().configure("com/rxp/hibernate/cfg/hibernate.cfg.xml");
    	ServiceRegistryBuilder builder = new ServiceRegistryBuilder();
    	builder.applySettings(configuration.getProperties());
    	ServiceRegistry registry = builder.buildServiceRegistry();
    	SessionFactory factory = configuration.buildSessionFactory(registry);
    	Session session = factory.openSession();
    	Address address = new Address("WL-47", "Ganjam", "Odisha", 761001);
    	Student student = new Student(101, "Niranjan", "B.Tech.", address);
    	Serializable serializable = session.save(student);
    	logger.info("Generated ID : " + serializable);
    	Transaction transaction = session.beginTransaction();
    	transaction.commit();
    }
}