package org.spring.dto;

public class AddDriverBeans {

	private int driverId;
	private String name;
	private String address;
	private String mobNo;
	private String dob;
	private String doj;
	private String licenceNo;
	private String exryDate;
	private String experience;
	private String emailId;
	private String employeeType;
	private int mId;

	
	
	public String getExryDate() {
		return exryDate;
	}

	public void setExryDate(String exryDate) {
		this.exryDate = exryDate;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	@Override
	public String toString() {
		return "AddDriverBeans [driverId=" + driverId + ", name=" + name + ", address=" + address + ", mobNo=" + mobNo
				+ ", dob=" + dob + ", doj=" + doj + ", licenceNo=" + licenceNo + ", exryDate=" + exryDate
				+ ", experience=" + experience + ", emailId=" + emailId + ", employeeType=" + employeeType + ", mId="
				+ mId + "]";
	}

	
}
