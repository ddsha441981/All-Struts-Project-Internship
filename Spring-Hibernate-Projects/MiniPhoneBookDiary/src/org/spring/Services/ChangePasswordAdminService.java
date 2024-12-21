package org.spring.Services;

import org.spring.BeansClass.ChangePasswordAdminBeans;
import org.spring.repositry.ChangePasswordAdminDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangePasswordAdminService {
	
	@Autowired(required =true)
	ChangePasswordAdminDaoImpl changePasswordAdminDaoImpl;
	
	public ChangePasswordAdminBeans adminChangePassword(ChangePasswordAdminBeans changePasswordAdminBeans){
		
		System.out.println("In Service Admin Change Password");
		return changePasswordAdminDaoImpl.adminChangePassword(changePasswordAdminBeans);
	}
	
public int updatedPasswordForAdmin(ChangePasswordAdminBeans changePasswordAdminBeans){
		
		System.out.println("In Service Admin Change Password");
		return changePasswordAdminDaoImpl.updatedPasswordForAdmin(changePasswordAdminBeans);
	}

}
