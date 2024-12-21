package org.hbm.student.examples;

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
		StudentInfo student = new StudentInfo();
		student.setStduentId(109);
		student.setStudentName("Nitin");
		student.setStudentAge(26);
		student.setDob(new Date());
		
		//Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
}
