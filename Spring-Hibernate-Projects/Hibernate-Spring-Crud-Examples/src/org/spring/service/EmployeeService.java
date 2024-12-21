package org.spring.service;

import java.util.List;

import org.spring.model.EmployeeModel;

public interface EmployeeService {

	public void addEmployess(EmployeeModel employeeModel);
	public List<EmployeeModel> getallOfEmployees();
}
