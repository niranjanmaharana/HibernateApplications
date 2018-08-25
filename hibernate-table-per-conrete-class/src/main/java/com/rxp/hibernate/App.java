package com.rxp.hibernate;

import java.io.Serializable;

import org.hibernate.Session;

import com.rxp.hibernate.domain.Circle;
import com.rxp.hibernate.domain.Rectangle;
import com.rxp.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args){
    	Session session = HibernateUtil.getSession();
    	Rectangle rectangle = new Rectangle("Rectangle", 100, 200);
    	Circle circle = new Circle("Circle", 50);
    	
    	Serializable serializable = session.save(rectangle);
    	session.beginTransaction().commit();
    	System.out.println("Rectangle object saved with Id : " + serializable);
    	
    	Serializable serializable2 = session.save(circle);
    	session.beginTransaction().commit();
    	System.out.println("Circle object saved with Id : " + serializable2);
    }
}