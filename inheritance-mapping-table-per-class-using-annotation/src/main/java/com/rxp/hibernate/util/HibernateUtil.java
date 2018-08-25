package com.rxp.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	public HibernateUtil() {}
	
	public static Session getSession(){
		Configuration configuration = new Configuration().configure("com/rxp/hibernate/cfg/hibernate.cfg.xml");
    	ServiceRegistryBuilder builder = new ServiceRegistryBuilder();
    	builder.applySettings(configuration.getProperties());
    	ServiceRegistry registry = builder.buildServiceRegistry();
    	SessionFactory factory = configuration.buildSessionFactory(registry);
    	Session session = factory.openSession();
    	return session;
	}
}