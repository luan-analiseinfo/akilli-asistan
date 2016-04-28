package com.mehmetzahit.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SignUp signup=new SignUp();

		signup.setName("sdasd");
		signup.setSurname("sad");
		signup.setEmail("asdsad");
		signup.setPassword("ss");
		
		
		
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(signup);
		session.getTransaction().commit();
	}

}
