package com.vikram.appmanagement.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vikram.appmanagement.entity.AppDetails;

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(AppDetails.class);
			sessionFactory  = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
