package com.rxp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Alien alien = new Alien();
        alien.setAid(101);
        alien.setAname("Niranjan");
        alien.setColor("Red");
        
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistryBuilder builder = new ServiceRegistryBuilder();
        builder.applySettings(configuration.getProperties());
        ServiceRegistry registry = builder.buildServiceRegistry();
        SessionFactory factory = configuration.buildSessionFactory(registry);
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(alien);
        transaction.commit();
    }
}