package com.rxp.hibernate.generator;

import java.io.Serializable;
import java.util.Random;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class HibernateGenerator implements IdentifierGenerator{
	public static final Logger LOGGER = Logger.getLogger(HibernateGenerator.class); 
	
	public HibernateGenerator() {
	}

	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		Random random = new Random();
		int randomNumber = random.nextInt(50) + 1;
		LOGGER.info("Generated Identifier : " + randomNumber);
		return randomNumber;
	}

}