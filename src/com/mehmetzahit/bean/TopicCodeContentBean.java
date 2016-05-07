package com.mehmetzahit.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class TopicCodeContentBean implements Serializable {

	private static final long serialVersionUID = 1L;
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
	
	public String yaz(){
		System.out.println("yaz hacý" + getContentID());
		return "TopicCodeContentBean";
	}
	
	public void bilo() {
		System.out.println("içerik ýd:"+getContentID()+"Üye no:"+getMemberID()+"Konu:"+getTopicID());
	
	}

}
