package org.spring.services;

import java.sql.SQLException;
import java.util.List;

import org.spring.dto.AddEmployeeBeans;
import org.spring.repositry.AddEmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddEmployeeServices {
	
	@Autowired
	AddEmployeeDaoImpl addEmployeeDaoImpl;
	
	public int addEmployees(AddEmployeeBeans addEmployeeBeans) throws SQLException{
		
		return addEmployeeDaoImpl.addEmployees(addEmployeeBeans);
	}
	
	public List<AddEmployeeBeans> viewsEmployees(AddEmployeeBeans addEmployeeBeans) throws SQLException{
		
		return addEmployeeDaoImpl.viewsEmployees(addEmployeeBeans);
	}

}
