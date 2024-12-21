package org.spring.services;

import java.util.List;

import org.spring.beans.UserLoginBeans;
import org.spring.dao.UserLoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServicesImpl implements UserLoginServices {

	@Autowired(required = true)
	UserLoginDao userLoginDao;
	
	
	@Override
	public int saveUserLoginContent(UserLoginBeans userLoginBeans) {
		
		return userLoginDao.saveUserLoginContent(userLoginBeans);
	}

	@Override
	public List<UserLoginBeans> viewUserLoginContent(UserLoginBeans userLoginBeans) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUserLoginContent(UserLoginBeans userLoginBeans) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUserLoginContent(UserLoginBeans userLoginBeans) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int userLoginContent(UserLoginBeans userLoginBeans) {
		
		return userLoginDao.userLoginContent(userLoginBeans);
	}

	@Override
	public UserLoginBeans userSingleProfile(UserLoginBeans userLoginBeans) {
		// 
		return userLoginDao.userSingleProfile(userLoginBeans);
	}

}
