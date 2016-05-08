package com.mehmetzahit.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;



@ManagedBean
@SessionScoped
public class TopicCodeContentBean implements Serializable {

	private static final long serialVersionUID = 1L;
private String icerik;
	private int contentID;
	private int memberID;
	private int topicID;
	
	
	
	private int CodeID;
	private String CodeText;
	
	
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
		return CodeID;
	}
	public void setCodeID(int codeID) {
		CodeID = codeID;
	}
	public String getCodeText() {
		return CodeText;
	}
	public void setCodeText(String codeText) {
		CodeText = codeText;
	}
	


	public void bilo(ActionEvent event) {
		System.out.println("bak hele bak:"+ this.contentID);
		System.out.println("içerik ýd:"+getContentID()+"Üye no:"+getMemberID()+"Konu:"+getTopicID());
	
	}

	public String getIcerik() {
		return icerik;
	}
	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

}
