package org.spring.client.beanclasses;

/**
 * The Class ClientLogin.
 * 
 * @author Deendayal
 * @version 1.1.2
 * @since 2017
 */
public class ClientLogin {

	private int clientId;
	private String clientName;
	private String clientpassword;

	/**
	 * Gets the client id.
	 * @return the client id
	 * Sets the client id.
	 * @param clientId
	 * the new client id
	 */
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	/**
	 * Gets the client name.
	 * @return the client name
	 * Sets the client name.
	 * @param clientName
	 * the new client name
	 */
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * Gets the clientpassword.
	 * @return the clientpassword
	 * Sets the clientpassword.
	 * @param clientpassword
	 * the new clientpassword
	 */
	public String getClientpassword() {
		return clientpassword;
	}

	public void setClientpassword(String clientpassword) {
		this.clientpassword = clientpassword;
	}

}
