package com.mehmetzahit.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mehmetzahit.entities.TopicContent;
import com.mehmetzahit.util.HibernateUtil;

public class App {

	private List<TopicContent> topiccontent = new ArrayList<TopicContent>();

	public List<TopicContent> getTopiccontent() {
		return topiccontent;
	}

	public void setTopiccontent(List<TopicContent> topiccontent) {
		this.topiccontent = topiccontent;
	}
	
	

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionfactory().openSession();
		Query query=session.createQuery("FROM TopicContent");
		List<TopicContent> list=query.list();
		
		for(TopicContent top:list){
			System.out.println(top.getContent());
		}
		
		
	}

}
