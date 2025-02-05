package com.hibernate.example;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Clients {

	public static void main(String[] args) {
		
		SessionFactory factory;
		Session session;
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		System.out.println("You're Connected");
		
		Transaction tr = session.beginTransaction();
		Customer custom = new Customer(101,"Deendayal",new Date(06, 8, 2016));
		session.save(custom);
		tr.commit();
		System.out.println("New Row Inserted SuccessFully");
		session.close();
	}
}
