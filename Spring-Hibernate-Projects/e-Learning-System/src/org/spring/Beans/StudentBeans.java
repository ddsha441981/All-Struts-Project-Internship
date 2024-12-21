package org.spring.Beans;

/***
 * @author : Deendayal
 * 
 * @param : Bean to set object of StudentBeans Beans class
 * 
 * @return : Getter and Setter data set 
 * 
 * @ since :June 30-2017
 */
public class StudentBeans {

	private int stdId;
	private String emailId;
	private String password;
	private String role;
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
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
