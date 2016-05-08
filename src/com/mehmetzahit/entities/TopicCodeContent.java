package com.mehmetzahit.entities;

import java.io.Serializable;

public class TopicCodeContent implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	private int contentID; 
	private int memberID; 
	private int topicID; 
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
	
	//--------------------------------------------------------------
	
	public TopicCodeContent(){
		
	}
	public TopicCodeContent(int contentID, int memberID, int topicID, int codeID, String codeContent,
			String codeTitle) {

		this.contentID = contentID;
		this.memberID = memberID;
		this.topicID = topicID;
		this.codeID = codeID;
		this.codeContent = codeContent;
		this.codeTitle = codeTitle;
	}
	
	
	


}
