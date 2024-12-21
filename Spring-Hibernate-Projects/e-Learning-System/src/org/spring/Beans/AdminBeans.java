package org.spring.Beans;

/***
 * @author : Deendayal
 * 
 * @param : Bean to set object of AdminBeans Beans class
 * 
 * @return : Getter and Setter data set 
 * 
 * @ since :June 30-2017
 */
public class AdminBeans {

	private int adminId;
	private String adminName;
	private String emailId;
	private String password;
	private String role;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
