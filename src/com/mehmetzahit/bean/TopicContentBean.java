package com.mehmetzahit.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.hibernate.Session;

import com.mehmetzahit.dao.TopicContentDAO;
import com.mehmetzahit.entities.TopicContent;
import com.mehmetzahit.util.HibernateUtil;



import javax.faces.application.FacesMessage;



@ManagedBean
public class TopicContentBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private int topicID; //parametre olarak deðer geçirildi.
	private String topicName; //parametre olarak deðer geçirildi.
	private int memberID; //parametre olarak deðer geçirildi.

	
	//-----------------------------------------
	private int contentID;
	private String contentTitle;
	private String  content;
	private String keywords;
	private int rating;
	
	
	
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
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public int getContentID() {
		return contentID;
	}
	public void setContentID(int contentID) {
		this.contentID = contentID;
	}
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
	public String calis(){
		
		TopicContent topicContent=new TopicContent();
		
		topicContent.setContentID(contentID);
		topicContent.setContentTitle(contentTitle);
		topicContent.setContent(content);
		topicContent.setKeywords(keywords);
		topicContent.setRating(rating);
		topicContent.setMemberID(memberID);
		topicContent.setTopicID(topicID);
		
	
		
		
	try {
		Session session=HibernateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		session.save(topicContent);
		session.getTransaction().commit();
		
		FacesContext context = FacesContext.getCurrentInstance();      
        context.addMessage(null, new FacesMessage("Tebrikler!", "Kategori Baþarýyla Oluþturuldu"));
        
		return "TopicContent";
		} catch (Exception e) {
			System.out.println("hata burda");
			return "TopicContent";
		}
		
		
	}
	
	

	
	

	
	
	

}
