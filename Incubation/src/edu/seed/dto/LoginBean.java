package edu.seed.dto;

/* Bean Class*/

/**
@author -Abhay singh solanki
@since  -07-march 2017
@return -userid,username,password 
*/

public class LoginBean {
	
private int roleid;
public int getRoleid() {
	return roleid;
}

public void setRoleid(int roleid) {
	this.roleid = roleid;
}
private String email;
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
private int userid;	
private String username;
private String password;
public String getUsername() {
	return username;
}

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public void setUsername(String username) 
{
this.username = username;
}

public String getPassword() 
{
return password;
}
public void setPassword(String password) 
{
this.password = password;
}

	
}
