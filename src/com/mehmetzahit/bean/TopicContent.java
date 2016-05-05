package com.mehmetzahit.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TopicContent implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String Parametre;
	
	
	

	
	public String getParametre() {
		return Parametre;
	}

	public void setParametre(String parametre) {
		Parametre = parametre;
	}
	
	

	

}
