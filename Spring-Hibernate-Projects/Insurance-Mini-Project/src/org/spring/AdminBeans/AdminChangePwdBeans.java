package org.spring.AdminBeans;

public class AdminChangePwdBeans {

	private int userId;
	private String email;
	private String autogeneratedPwd;

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

	public String getAutogeneratedPwd() {
		return autogeneratedPwd;
	}

	public void setAutogeneratedPwd(String autogeneratedPwd) {
		this.autogeneratedPwd = autogeneratedPwd;
	}

}
