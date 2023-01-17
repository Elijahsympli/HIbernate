package com.OneToOne.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
public static Session activateSession() {
	SessionFactory sFactory=new Configuration().configure().buildSessionFactory();
Session session=sFactory.openSession();
return session; 
}
}
