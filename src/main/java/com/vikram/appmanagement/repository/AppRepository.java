package com.vikram.appmanagement.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vikram.appmanagement.entity.AppDetails;
import com.vikram.appmanagement.util.ConnectionPropertiesUtil;

public class AppRepository {
	
	public void save(AppDetails appDetails) {
		Configuration cfg= new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(AppDetails.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(appDetails);
		transaction.commit();
	}
	
	public AppDetails findById(int id) {
		Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(AppDetails.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(AppDetails.class, id);
	}
}
