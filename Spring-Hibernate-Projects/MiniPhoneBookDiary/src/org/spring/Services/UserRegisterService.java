package org.spring.Services;

import org.spring.BeansClass.UserRegisterBeans;
import org.spring.repositry.UserRegisterDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {

	@Autowired(required = true)
	
	UserRegisterDaoImpl userRegisterdao;
	
	public int registerUserContents(UserRegisterBeans userRegisterBeans){
		System.out.println("In Service Class");
		return userRegisterdao.registerUserContents(userRegisterBeans);
	}
	
	
}
