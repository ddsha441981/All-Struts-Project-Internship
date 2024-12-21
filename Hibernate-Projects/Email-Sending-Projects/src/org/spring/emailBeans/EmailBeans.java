package org.spring.emailBeans;

/**
 * @author Deendayal
 * @since 7 march 2017
 * @version 1.1.2
 */
public class EmailBeans {

	
	private String recipient;
	private String subject;
	private String message;

	

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
