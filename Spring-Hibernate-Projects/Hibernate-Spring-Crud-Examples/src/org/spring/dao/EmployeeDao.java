package org.spring.dao;

import java.util.List;

import org.spring.model.EmployeeModel;

/**
* @author Deendayal Kumawat
* @since 14 march 2017
* @version 1.2.5
*/
public interface EmployeeDao {

	public void addEmployee(EmployeeModel employeeModel);
	
	public List<EmployeeModel> getallOfEmployees();
}
