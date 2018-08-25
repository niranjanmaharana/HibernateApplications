package com.rxp.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.rxp.hibernate.domain.Account;

/**
 * Hello world!
 *
 */
public class App {
	public static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) {
    	Configuration configuration = new Configuration().configure("com/rxp/hibernate/cfg/hibernate.cfg.xml");
    	logger.info("Configuration is created : " + configuration.getProperties());
    	ServiceRegistryBuilder builder = new ServiceRegistryBuilder();
    	logger.info("ServiceRegistryBuilder is created : " + builder);
    	builder.applySettings(configuration.getProperties());
    	logger.info("ServiceRegistryBuilder is applied with the configuration settings : " + builder);
    	ServiceRegistry registry = builder.buildServiceRegistry();
    	logger.info("ServiceRegistry is created from ServiceRegistryBuilder : " + registry);
    	SessionFactory factory = configuration.buildSessionFactory(registry);
    	logger.info("SessionFactory is created from Configuration obj with ServiceRegistryBuilder instance parameter : " + factory);
    	Session session = factory.openSession();
    	logger.info("Session is created from SessionFactory : " + session);
    	Account account = new Account("Pintu Maharana", 500000000);
    	logger.info("Account obj created : " + account);
    	String uid = (String) session.save(account);
    	logger.info("UID : " + uid);
    	Transaction transaction = session.beginTransaction();
    	transaction.commit();
    }
}