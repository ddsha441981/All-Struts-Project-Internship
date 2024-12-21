package org.hbm.examples;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2 
 * Class AppTest
 */
public class AppTest {

	public static void main(String[] args) {
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		Employee emp1 = new Employee();
		emp1.setId(01);
		emp1.setFname("Deendayal");
		emp1.setLname("Kumawat");
		
		Employee emp2 = new Employee();
		emp2.setId(02);
		emp2.setFname("Prajjwal");
		emp2.setLname("Upadhaye");
		
		Employee emp3 = new Employee();
		emp3.setId(03);
		emp3.setFname("Farhaz");
		emp3.setLname("Pathan");
		
		session.persist(emp1);
		session.persist(emp2);
		session.persist(emp3);
		
		t.commit();
		session.close();
		System.out.println("SuccessFully Saved");
	}
}
