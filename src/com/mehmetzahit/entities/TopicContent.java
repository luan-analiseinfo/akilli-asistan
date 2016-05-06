package com.mehmetzahit.entities;

import java.io.Serializable;

public class TopicContent implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int contentID;
	private String contentTitle;
	private String  content;
	private String keywords;
	private int rating;
	private int memberID;
	private int topicID;
	
	//-----------------------------------------
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
	
	public TopicContent(){
		
	}
	
	public TopicContent(int contentID, String contentTitle, String content, String keywords, int rating, int memberID,
			int topicID) {
	
		this.contentID = contentID;
		this.contentTitle = contentTitle;
		this.content = content;
		this.keywords = keywords;
		this.rating = rating;
		this.memberID = memberID;
		this.topicID = topicID;
	}
	
	

	
	
	


}
