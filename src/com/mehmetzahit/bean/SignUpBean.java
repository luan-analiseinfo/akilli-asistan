package com.mehmetzahit.bean;



import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import org.hibernate.Session;

import com.mehmetzahit.map.SignUp;
import com.mehmetzahit.util.HibernateUtil;

@ManagedBean
public class SignUpBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
//--------------------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String SaveDate(){
		SignUp signup=new SignUp();
		
		signup.setName(name);
		signup.setSurname(surname);
		signup.setEmail(email);
		signup.setPassword(password);
		
		
		
		
		try {
			Session session=HibernateUtil.getSessionfactory().openSession();
			session.beginTransaction();
			session.save(signup);
			session.getTransaction().commit();
			session.clear();
			session.close();
			
			return "index";
			
		} catch (Exception e) {
			return "error";
		}
		
		
	}
	
	
}
