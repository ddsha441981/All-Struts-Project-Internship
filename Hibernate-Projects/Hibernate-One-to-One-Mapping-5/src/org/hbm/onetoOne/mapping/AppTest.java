package org.hbm.onetoOne.mapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AppTest {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.setStdName("Samsung");
		
		Studentdetails std2 = new Studentdetails();
		std2.setMob("9xx2xx3x3x");
		std2.setDob(new Date());
		
		//this is important steps
		std2.setStudent(std1);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		/***
		 * Here i am not saving student object but still it will be saved in database
		 * That's magic of one to one Mapping
		 *  */
		session.save(std2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
