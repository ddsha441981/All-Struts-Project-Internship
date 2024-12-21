package org.hbm.examples;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author Deendayal
 * @since 2 march 2017
 */
public class AppTest {

	public static void main(String[] args) {
		Student student2 = new Student();
		student2.setName("Nitin Khutemate");
		
		
		//Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
}
