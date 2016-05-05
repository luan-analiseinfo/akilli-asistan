package com.mehmetzahit.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mehmetzahit.dao.LoginDAO;

import com.mehmetzahit.entities.Members;
import com.mehmetzahit.entities.Topics;
import com.mehmetzahit.util.HibernateUtil;

@ManagedBean
@SessionScoped
public class MembersBean {

	private String email;
	private String password;
	private int memberID;
	private ArrayList<String> asd = new ArrayList<String>();
	private ArrayList<Integer> topicID = new ArrayList<Integer>();
	
	private HashMap<Integer, String>ogrno=new HashMap<Integer,String>();

	


	public HashMap<Integer, String> getOgrno() {
		return ogrno;
	}

	public void setOgrno(HashMap<Integer, String> ogrno) {
		this.ogrno = ogrno;
	}

	public ArrayList<Integer> getTopicID() {
		return topicID;
	}

	public void setTopicID(ArrayList<Integer> topicID) {
		this.topicID = topicID;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public ArrayList<String> getAsd() {
		return asd;
	}

	public void setAsd(ArrayList<String> asd) {
		this.asd = asd;
	}

	// -----------------------------------------------
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

	public String validateUsernamePassword() {

		boolean valid = LoginDAO.validate(getEmail(), getPassword());
		if (valid) {
			HttpSession session = SessionBean.getSession();
			session.setAttribute("username", getEmail());

			bilgi();
			callTopic();

			return "admin?faces-redirect=true";

		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Incorrect Username and Passowrd", "Please enter correct username and Password"));
			return "login?faces-redirect=true";
		}
	}

	public void bilgi() {

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("from Members WHERE email=:parametre");
		query.setParameter("parametre", getEmail());
		List<Members> memberList = query.list();

		for (Members member : memberList) {

			setMemberID(member.getMemberID());

		}
	}

	public void callTopic() {
		// Session session =HibernateUtil.getSessionfactory().openSession();

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("FROM Topics WHERE memberID=:parametre");
		query.setParameter("parametre", getMemberID());
		List<Topics> list = query.list();

		for (Topics topics : list) {
			
			ogrno.put(53,"rize");
			//ogrno.put(topics.getTopicID(),topics.getTopicName());
		}

		System.out.println(ogrno.keySet());
	

	}

	public String logout() {
		HttpSession session = SessionBean.getSession();
		session.invalidate();
		return "login?faces-redirect=true";
	}

}
