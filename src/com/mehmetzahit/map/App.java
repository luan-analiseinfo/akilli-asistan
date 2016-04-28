package com.mehmetzahit.map;

import org.hibernate.Session;

import com.mehmetzahit.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		SignUp signup=new SignUp();

		signup.setName("sdasd");
		signup.setSurname("sad");
		signup.setEmail("asdsad");
		signup.setPassword("ss");
		
	
		Session session=HibernateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		session.save(signup);
		session.getTransaction().commit();
	}

}
