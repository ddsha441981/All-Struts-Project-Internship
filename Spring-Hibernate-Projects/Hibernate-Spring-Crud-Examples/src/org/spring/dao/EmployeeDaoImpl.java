package org.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.spring.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
* @author Deendayal Kumawat
* @since 14 march 2017
* @version 1.2.5
*/
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired(required = true)
	//JdbcTemplate template;
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addEmployee(EmployeeModel employeeModel) {
		
		System.out.println("In Dao Class");
		/*sessionFactory.openSession().save(employeeModel);*/
		Session s =sessionFactory.openSession();
		Transaction tr = s.beginTransaction();
		s.save(employeeModel);
		tr.commit();
		System.out.println("Records Stored successfully");
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeModel> getallOfEmployees() {

		Session s =sessionFactory.openSession();
		Transaction tr = s.beginTransaction();
		List<EmployeeModel> h = s.createCriteria(EmployeeModel.class).list();
		System.out.println("///////////////////////"+h.size());
		System.out.println("///////////////////////"+h.toString());
		return h;
		
	}

}
