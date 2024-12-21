package org.spring.daoimpl;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spring.dao.Employeedao;
import org.spring.services.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DaoImpli implements Employeedao {

	@Autowired
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void add(SignUp signup) {
		sessionFactory.openSession().save(signup);
		/*Session s=sessionFactory.openSession();
		Transaction tr=(Transaction) s.beginTransaction();
			s.save(signup);*/
		
	}
@Transactional
	@SuppressWarnings("unchecked")
	public List<SignUp> getall() {
		
		System.out.println("In Dao Class");
		return this.sessionFactory.getCurrentSession().createQuery("select name from signUp").list();
	}
	

}
