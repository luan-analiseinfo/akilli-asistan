package com.mehmetzahit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = olusturSessionFactory();

	private static SessionFactory olusturSessionFactory() {

		try {
			return new Configuration().configure().buildSessionFactory();

		} catch (Exception e) {
			return null;
		}

	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	public static void shutDown() {
		olusturSessionFactory().close();
	}

}
