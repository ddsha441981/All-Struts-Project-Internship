package org.spring.admin.beanclasses;
/**
 * The Class AdminLoginbean.
 *
 * @author Deendayal
 * @version 1.1.2
 * @since 
 */

public class AdminLoginbean {

/** 
 * Class Data Members
 * The username.
 * The password. 
 */
private int adminId;
private String username;
private String password;

/**
 * Gets the adminId.
 * @return the adminId
 * Sets the admainId.
 * @param adminId the new AdmainId
 */
public int getAdminId() {
	return adminId;
}

public void setAdminId(int adminId) {
	this.adminId = adminId;
}

/**
 * Gets the username.
 * @return the username
 * Sets the username.
 * @param username the new username
 */
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

/**
 * Gets the password.
 * @return the password
 * Sets the password.
 * @param password the new password
 */
public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
