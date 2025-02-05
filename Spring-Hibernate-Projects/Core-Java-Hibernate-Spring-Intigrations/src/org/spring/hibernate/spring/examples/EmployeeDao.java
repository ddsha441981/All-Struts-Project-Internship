package org.spring.hibernate.spring.examples;

import java.util.List;

/**
 * The Interface EmployeeDao.
 * @author Deendayal
 * @Since 2017
 * @Version 1.1.2
 */
public interface EmployeeDao {

	/** 
	  * This is the method to be used to create
	  * a record in the Employee table.
	  */
	 void createEmployee(Employee employee);
	 /** 
	  * This is the method to be used to list down
	  * a record from the Employee table corresponding
	  * to a passed Employee id.
	  */
	/* Employee getEmployee(Integer empid);
	 *//** 
	  * This is the method to be used to list down
	  * all the records from the Employee table.
	  *//*
	 List listEmployees();
	 *//** 
	  * This is the method to be used to delete
	  * a record from the Employee table corresponding
	  * to a passed Employee id.
	  *//*
	 void delete(Employee employee);
	 *//** 
	  * This is the method to be used to update
	  * a record into the Employee table.
	  *//*
	 void update(Employee employee);*/
}
