package org.spring.services;

import java.util.List;

import org.spring.beans.UserLoginBeans;

public interface UserLoginServices {

	public int saveUserLoginContent(UserLoginBeans userLoginBeans);
	public List<UserLoginBeans> viewUserLoginContent(UserLoginBeans userLoginBeans);
	public UserLoginBeans userSingleProfile(UserLoginBeans userLoginBeans);
	public int updateUserLoginContent(UserLoginBeans userLoginBeans);
	public int deleteUserLoginContent(UserLoginBeans userLoginBeans);
	public int userLoginContent(UserLoginBeans userLoginBeans);
}
