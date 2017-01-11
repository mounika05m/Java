package com.hb.component;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure("hbm.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		
		Employee e= new Employee();
		e.setName("Ajith");
		
		Address addr= new Address();
		addr.setCity("Chennai");
		addr.setState("Tamil Nadu");
		addr.setCountry("India");
		addr.setPincode(621301);
		
		e.setAddress(addr);
		//addr.setEmployee(e);
		
		
		session.save(e);
		//session.save(addr);
		
		System.out.println("Object saved successfully");
		session.getTransaction().commit();
		session.close();
		
	}

}
