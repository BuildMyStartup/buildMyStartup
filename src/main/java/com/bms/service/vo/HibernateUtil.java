package com.bms.service.vo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	  
    private static final SessionFactory sessionFactory = buildSessionFactory();
  
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory(); //if name of the file is hibernate.cfg.xml (default name), no need to provide it in configure() method
        } catch (Throwable ex) {
        	ex.printStackTrace();
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
  
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
