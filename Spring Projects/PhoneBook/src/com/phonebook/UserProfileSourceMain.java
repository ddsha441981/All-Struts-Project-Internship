package com.phonebook;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;

public class UserProfileSourceMain implements SessionAware {
	int userid;
	String username;
	String firstname;
	String lastname;
	String email;
	String password;
	String cfpassword;
	String msg;
	String P1; /* obj of DAO Class fetch by id */
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCfpassword() {
		return cfpassword;
	}
	public void setCfpassword(String cfpassword) {
		this.cfpassword = cfpassword;
	}
	
	
	
	public String getP1() {
		return P1;
	}
	public void setP1(String p1) {
		P1 = p1;
	}
	@Override
	public String toString() {
		return "UserProfileSourceMain [userid=" + userid + ", username=" + username + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", password=" + password + ", cfpassword="
				+ cfpassword + "]";
	}
	public String userProfileRegister(){
		int result = DAOUserProfileSource.saveUserProfile(this);
		if(result>0){
			msg="<div class='alert alert-success'><strong>Success!</strong> You'r successful Registered.</div>";
			return "success";	
		}
		else{
			msg="<div class='alert alert-danger'><strong>Danger!</strong> You'r  Not Registered yet.</div>";
			return "error";
		}
		
	}
	
	public String usercontactById(){/* Data fetch using id by session*/
		int userid=(Integer)sessionmap.get("myuserId");
		System.out.println("Get Record for : "+userid);
		UserProfileSourceMain S1= DAOUserProfileSource.contactfetch(userid);
		
		System.out.println("Data fetch By Object"+P1);
		if(S1.getUserid()>0){ /*if(pm1.getId()>0){*/
			System.out.println("In Condition :-"+S1.getUserid());
			request.setAttribute("info", P1);
			return "success";
		}

		return "error";
	
}
	Map sessionmap;
	@Override
	public void setSession(Map map) {
		  sessionmap=map;  
		  
	}
	HttpServletRequest request;
	public void setServletRequest(HttpServletRequest arg0) {
		request=arg0;
		
	}

}
