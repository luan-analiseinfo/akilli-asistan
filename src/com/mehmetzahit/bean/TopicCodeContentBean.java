package com.mehmetzahit.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

import com.mehmetzahit.entities.TopicCodeContent;
import com.mehmetzahit.entities.TopicContent;
import com.mehmetzahit.util.HibernateUtil;

@ManagedBean
@SessionScoped
public class TopicCodeContentBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private int contentID; //setPropertyActionListener ile deðer atanmasý
	private int memberID; //setPropertyActionListener ile deðer atanmasý
	private int topicID; //setPropertyActionListener ile deðer atanmasý

	private int codeID;
	private String codeContent;
	private String codeTitle;

	public int getContentID() {
		return contentID;
	}

	public void setContentID(int contentID) {
		this.contentID = contentID;
	}

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

	public int getCodeID() {
		return codeID;
	}

	public void setCodeID(int codeID) {
		this.codeID = codeID;
	}

	public String getCodeContent() {
		return codeContent;
	}

	public void setCodeContent(String codeContent) {
		this.codeContent = codeContent;
	}

	public String getCodeTitle() {
		return codeTitle;
	}

	public void setCodeTitle(String codeTitle) {
		this.codeTitle = codeTitle;
	}

	public String addCode() {
		TopicCodeContent tcc=new TopicCodeContent();
		
		tcc.setCodeTitle(codeTitle);
		tcc.setCodeContent(codeContent);
		tcc.setContentID(contentID);
		tcc.setTopicID(topicID);
		tcc.setMemberID(memberID);
		
		Session session=HibernateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		session.save(tcc);
		session.getTransaction().commit();
		
		
		
		System.out.println("1:" + contentID + "2:" + getMemberID() + "3:" + topicID);

		return "TopicContent?faces-redirec=true";

	}

}
