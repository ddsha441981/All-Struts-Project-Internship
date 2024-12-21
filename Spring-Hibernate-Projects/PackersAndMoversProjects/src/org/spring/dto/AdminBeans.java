package org.spring.dto;

public class AdminBeans {

	private int adminId;
	private String adminName;
	private String emailId;
	private String autoPassword;
	private String userRole;
	
	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAutoPassword() {
		return autoPassword;
	}

	public void setAutoPassword(String autoPassword) {
		this.autoPassword = autoPassword;
	}

}
