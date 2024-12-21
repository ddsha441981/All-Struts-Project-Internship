package org.spring.Services;

import org.spring.BeansClass.UserRegisterBeans;
import org.spring.repositry.UserLoginDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

	@Autowired(required = true)
	UserLoginDaoImpl userLoginDaoImpl;
	
	public int loginCrentials(UserRegisterBeans userRegisterBeans){
		
		return userLoginDaoImpl.loginCrentials(userRegisterBeans);
	}
}
