package org.spring.services;

import org.spring.dto.AddEmployeeBeans;
import org.spring.dto.AdminLoginBeans;
import org.spring.dto.ManagerBeans;
import org.spring.repositry.LoginDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServices {
	
	@Autowired
	LoginDaoImpl loginDaoImpl;
	
	public int adminLogin(AdminLoginBeans adminLoginBeans){
		
		return loginDaoImpl.adminLogin(adminLoginBeans);
	}
	
public int employeeLogin(AddEmployeeBeans addEmployeeBeans){
		
		return loginDaoImpl.employeeLogin(addEmployeeBeans);
	}

	public int managerLogin(ManagerBeans managerBeans){
	
	return loginDaoImpl.managerLogin(managerBeans);
	}

}
