package com.mehmetzahit.bean;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Session;

import com.mehmetzahit.entities.CreateTopic;
import com.mehmetzahit.util.HibernateUtil;

@ManagedBean
@SessionScoped
public class CreateTopicBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int topicID;
	private String topicName;
	private String topicType;
	private int memberID;
	
	private String parametre;
	
	
	public String getParametre() {
		return parametre;
	}
	public void setParametre(String parametre) {
		this.parametre = parametre;
	}
	//---------------------------------------------------
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	
	

	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicType() {
		return topicType;
	}
	public void setTopicType(String topicType) {
		this.topicType = topicType;
	}
	
	
	public void saveDB(){
		CreateTopic createtopic=new CreateTopic();
		createtopic.setTopicName(topicName);
		createtopic.setMemberID(Integer.parseInt(parametre));
		
		System.out.println(Integer.parseInt(parametre)+"bu parameter");
	
		
		try {
			
			Session session=HibernateUtil.getSessionfactory().openSession();
			session.beginTransaction();
			
			session.save(createtopic);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println("Hata var bah bahalým nedir");
		}
		
		
		
	}

}
