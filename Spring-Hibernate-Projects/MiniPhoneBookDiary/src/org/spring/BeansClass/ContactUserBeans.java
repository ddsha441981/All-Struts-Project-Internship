package org.spring.BeansClass;

public class ContactUserBeans {

	private int contactId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobNo;
	private int userId;

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "ContactUserBeans [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", mobNo=" + mobNo + ", userId=" + userId + "]";
	}

	

	
}
