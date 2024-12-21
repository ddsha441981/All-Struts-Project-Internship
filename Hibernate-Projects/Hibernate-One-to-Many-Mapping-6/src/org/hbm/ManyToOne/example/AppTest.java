package org.hbm.ManyToOne.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author Deendayal
 * @since 4 march 2017
 * @version 1.1.2
 */
public class AppTest {

	public static void main(String[] args) {
		
		StudentAddress stdadd = new StudentAddress();
		stdadd.setAddress("Pune,India");
		
		Student std1 = new Student();
		std1.setName("Deendayal");
		
		//this is important steps
		std1.setStdaddress(stdadd);
		
		Student std2 = new Student();
		std2.setName("Nitin");
		
		//this is important steps
		std2.setStdaddress(stdadd);
		
		
				
				
				SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				/***
				 * Here i am not saving studentAddress object but still it will be saved in database
				 * That's magic of Many to one  Mapping
				 *  */
				session.save(std1);
				session.save(std2);
				
				session.getTransaction().commit();
				session.close();
				sessionFactory.close();
	}
}
