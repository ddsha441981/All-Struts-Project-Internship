package org.spring.BeansClass;

public class ChangePasswordUserBeans {

	private int userId;
	private String email;
	private String autoPassword;
	private String cfPassword;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getCfPassword() {
		return cfPassword;
	}

	public void setCfPassword(String cfPassword) {
		this.cfPassword = cfPassword;
	}

}
