package org.spring.Services;

import org.spring.BeansClass.LoginBeans;
import org.spring.repositry.AdminLoginDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServices {

	@Autowired(required = true)
	AdminLoginDaoImpl adminLoginDaoImpl;
	
	public int adminLoginRedirect(LoginBeans loginBeans){
		
		System.out.println("In Admin Services");
		return adminLoginDaoImpl.adminLoginRedirect(loginBeans);
	}
}
