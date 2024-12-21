package com.myfirst.Hibernate.Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class Test {
	
		public static void main(String[] args) {
		
		Student_Info std = new Student_Info();
		std.setName("Deendayal");
		std.setRollNo(2);
		

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student_Info object into the database
		session.save(std);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
