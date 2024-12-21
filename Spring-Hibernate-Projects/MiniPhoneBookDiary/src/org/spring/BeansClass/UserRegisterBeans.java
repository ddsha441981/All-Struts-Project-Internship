package org.spring.BeansClass;

import java.util.Date;

public class UserRegisterBeans {

	private int userId;
	private String username;
	private String email;
	private String autoPassword;
	//private Date dob;
	private String contactNo;
	private String address;
	private String UserRole;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAutoPassword() {
		return autoPassword;
	}

	public void setAutoPassword(String autoPassword) {
		this.autoPassword = autoPassword;
	}

	/*public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}*/

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserRole() {
		return UserRole;
	}

	public void setUserRole(String userRole) {
		UserRole = userRole;
	}

}
