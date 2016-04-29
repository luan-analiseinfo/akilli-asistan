package com.mehmetzahit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoginDAO {

	public static boolean validate(String user, String password) {

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();

		Query query = session.createQuery(" From Members where Email=:parametre and Password=:parametre2");
		query.setParameter("parametre", user);
		query.setParameter("parametre2", password);
		List<?> list = query.list();

		if (list.size() > 0)
			return true;
		else
			return false;

	}
}
