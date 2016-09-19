package com.java.test;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Eventmain {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		
		Transaction tr= session.beginTransaction();
		
		Event event= new Event();
		event.setId(101);
		event.setTitle("One to Many");
		
		List<Speaker> list= new ArrayList<Speaker>();
		Speaker sp1= new Speaker();
		sp1.setSname("Mounika");
		sp1.setMailid("mounika05m@gmail.com");
		
		Speaker sp2= new Speaker();
		sp2.setSname("Harika");
		sp2.setMailid("harika14@gmail.com");
		
		Speaker sp3= new Speaker();
		sp3.setSname("Nikhil");
		sp3.setMailid("nikhilT@gmail.com");
		
		list.add(0,sp1);
		list.add(1,sp2);
		list.add(2,sp3);
		
		event.setSpeakers(list);
		
		session.save(event);
		tr.commit();
		session.close();
		
		
		
		
	}

}
