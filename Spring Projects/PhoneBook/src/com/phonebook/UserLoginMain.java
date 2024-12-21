package com.phonebook;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class UserLoginMain implements SessionAware {
int userid;
String username;
String password;
Map mysession;

public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String loginByUser(){
	int userid = DAOuserLogin.loginuser(this);
	if(userid>0)
	{
		mysession.put("myId", userid);
	return "success";
	}
	return "error";
}
@Override
public void setSession(Map map) {
	mysession=map;
}

}
