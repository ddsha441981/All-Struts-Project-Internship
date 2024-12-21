package org.spring.Services;

import org.spring.BeansClass.ChangePasswordUserBeans;
import org.spring.repositry.ChangePasswordUserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangePasswordUserService {
	
	@Autowired(required = true)
	ChangePasswordUserDaoImpl changePasswordUserDaoImpl;
	
	public ChangePasswordUserBeans userchangingOwnPassword(ChangePasswordUserBeans changePasswordUserBeans){
		
		System.out.println("In Service");
		return changePasswordUserDaoImpl.userchangingOwnPassword(changePasswordUserBeans);
	}
	
public int updatedUserChangePassword(ChangePasswordUserBeans changePasswordUserBeans){
		
		System.out.println("In Service");
		return changePasswordUserDaoImpl.updatedUserChangePassword(changePasswordUserBeans);
	}

}
