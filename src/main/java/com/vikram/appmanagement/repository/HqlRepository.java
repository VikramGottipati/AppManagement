package com.vikram.appmanagement.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.vikram.appmanagement.entity.AppDetails;
import com.vikram.appmanagement.util.SessionFactoryUtil;

public class HqlRepository {
	public List<AppDetails> findAll() {
		StringBuilder builder = new StringBuilder();
		builder.append("from AppDetails");
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		Query query = session.createQuery(builder.toString());
		return query.getResultList();
	}
	
	public List<AppDetails> findByName(String name) {
		String hqlQuery="from AppDetails where serviceName=:n";
		StringBuilder builder = new StringBuilder();
		builder.append(hqlQuery);
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		query.setParameter("n", name);
		return query.getResultList();
	}
}
