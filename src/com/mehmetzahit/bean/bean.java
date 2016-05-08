package com.mehmetzahit.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class bean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String deger;

	public String getDeger() {
		return deger;
	}

	public void setDeger(String deger) {
		this.deger = deger;
	}

	public void bilo() {
		System.out.println("deðer: " + deger);
	}
}
