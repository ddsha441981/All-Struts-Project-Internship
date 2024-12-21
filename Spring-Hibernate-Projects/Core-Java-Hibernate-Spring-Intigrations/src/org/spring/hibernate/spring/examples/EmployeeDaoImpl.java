package org.spring.hibernate.spring.examples;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class EmployeeDaoImpl.
 * @author Deendayal
 * @Since 2017
 * @Version 1.1.2
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	//@Autowired(required=true)
	SessionFactory factory;
	
	/*public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	*/
	@Transactional
	@Override
	public void createEmployee(Employee employee) {
		Session s=factory.getCurrentSession();
		//Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
			s.saveOrUpdate(employee);
		tr.commit();
		s.close();
	}

	/*@Override
	public Employee getEmployee(Integer empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}*/

	
}
