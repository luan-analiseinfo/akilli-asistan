package com.mehmetzahit.bean;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.mehmetzahit.entities.TopicContent;
import com.mehmetzahit.util.HibernateUtil;

public class SearcEngineBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public void search(){
		Session session=HibernateUtil.getSessionfactory().openSession();
		Query query=session.createQuery("FROM TopicContent WHERE memberID=:parametre1 and topicID=:parametre2");
		query.setParameter("parametre1",)
		List<TopicContent> list=query.list();
		
		for(TopicContent top:list){
			System.out.println(top.getContent());
		}
		
	}

}
