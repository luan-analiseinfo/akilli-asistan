package com.mehmetzahit.dao;

import org.hibernate.Session;

import com.mehmetzahit.entities.TopicCodeContent;
import com.mehmetzahit.util.HibernateUtil;

public class TopicCodeContentDAO {

	public static String SaveCode(String codeTitle, String codeContent, int contentID, int topicID, int memberID) {

		TopicCodeContent tcc = new TopicCodeContent();

		tcc.setCodeTitle(codeTitle);
		tcc.setCodeContent(codeContent);
		tcc.setContentID(contentID);
		tcc.setTopicID(topicID);
		tcc.setMemberID(memberID);

		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			session.beginTransaction();
			session.save(tcc);
			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Kayýt Ekleme hatasý");
		}

		System.out.println("1:" + contentID + "2:" + memberID + "3:" + topicID);

		return "TopicContent?faces-redirec=true";

	}

}
