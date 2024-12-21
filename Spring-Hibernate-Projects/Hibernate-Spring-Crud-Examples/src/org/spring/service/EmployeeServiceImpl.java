package org.spring.service;
import java.util.List;

import org.spring.dao.EmployeeDao;
/**
* @author Deendayal Kumawat
* @since 14 march 2017
* @version 1.2.5
*/
import org.spring.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired(required = true)
	EmployeeDao employeedao; 
	
	@Override
	public void addEmployess(EmployeeModel employeeModel) {
		System.out.println("In Service Method");
		employeedao.addEmployee(employeeModel);
		
	}

	@Override
	public List<EmployeeModel> getallOfEmployees() {
		
		
		return employeedao.getallOfEmployees();
	}

}
