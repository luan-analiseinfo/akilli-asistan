package com.mehmetzahit.entities;

import java.io.Serializable;

public class Topics implements Serializable {
	private static final long serialVersionUID = 1L;

	private int topicID;
	private String topicName;
	private int memberID;
	private Members members;

	public Members getMembers() {
		return members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	// -----------------------------------------
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

	public Topics(int topicID, String topicName, int memberID) {
		this.topicID = topicID;
		this.topicName = topicName;
		this.memberID = memberID;
	}
	
	public Topics(int topicID, String topicName) {
		this.topicID = topicID;
		this.topicName = topicName;	
	}

	public Topics() {

	}

}
