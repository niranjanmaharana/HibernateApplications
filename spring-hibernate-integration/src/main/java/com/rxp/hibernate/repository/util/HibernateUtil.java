package com.rxp.hibernate.repository.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateUtil {
	public static SessionFactory sessionFactory;
	
	public HibernateUtil() {}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void setSessionFactory(SessionFactory sessionFactory) {
		HibernateUtil.sessionFactory = sessionFactory;
	}
	public static Session getSession(){
		return sessionFactory != null ? sessionFactory.openSession() : null;
	}
	public static Transaction getTransaction(Session session){
		return session != null ? session.beginTransaction() : null;
	}
}