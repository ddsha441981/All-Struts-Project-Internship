package org.spring.Services;

import java.util.List;

import org.spring.BeansClass.ContactUserBeans;
import org.spring.BeansClass.UserRegisterBeans;
import org.spring.repositry.AdminviewUserListDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminviewUserListService {

	@Autowired(required = true)
	AdminviewUserListDaoImpl adminViewuserListDaoImpl;
	
	public List<UserRegisterBeans>adminViewListUserList(UserRegisterBeans userRegisterBeans){
		
		return adminViewuserListDaoImpl.adminViewListUserList(userRegisterBeans);
	}
	
public List<ContactUserBeans>adminViewContactsListById(Integer userId ){
		
		return adminViewuserListDaoImpl.adminViewContactsListById(userId);
	}
}
