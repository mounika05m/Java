package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		/*Configuration cn= new Configuration();
		cn.configure("Hibernate.cfg.xml");
		SessionFactory factory= cn.buildSessionFactory();
		*/
		
		SessionFactory sf= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session= sf.openSession();
		session.beginTransaction();
		
		Product p= new Product();
		p.setProductid(101);
		p.setProName("iPhone6s");
		p.setPrice(50000);
		
		session.save(p);
		System.out.println("Object saved successfully");
		session.getTransaction().commit();
		session.close();
		
		
	}

}
