package org.spring.dto;

public class FeedbackBeans {

	private int feedbackId;
	private String name;
	private String emailId;
	private String mobNo;
	private String vehicleNo;
	private String cabArrived;
	private String cabCondition;
	private String driverSkills;
	private String driverBehavior;
	private String cabExperience;
	private String complaint;
	private String query;
	
	

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getCabArrived() {
		return cabArrived;
	}

	public void setCabArrived(String cabArrived) {
		this.cabArrived = cabArrived;
	}

	public String getCabCondition() {
		return cabCondition;
	}

	public void setCabCondition(String cabCondition) {
		this.cabCondition = cabCondition;
	}

	public String getDriverSkills() {
		return driverSkills;
	}

	public void setDriverSkills(String driverSkills) {
		this.driverSkills = driverSkills;
	}

	public String getDriverBehavior() {
		return driverBehavior;
	}

	public void setDriverBehavior(String driverBehavior) {
		this.driverBehavior = driverBehavior;
	}

	public String getCabExperience() {
		return cabExperience;
	}

	public void setCabExperience(String cabExperience) {
		this.cabExperience = cabExperience;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	@Override
	public String toString() {
		return "FeedbackBeans [feedbackId=" + feedbackId + ", name=" + name + ", emailId=" + emailId + ", mobNo="
				+ mobNo + ", vehicleNo=" + vehicleNo + ", cabArrived=" + cabArrived + ", cabCondition=" + cabCondition
				+ ", driverSkills=" + driverSkills + ", driverBehavior=" + driverBehavior + ", cabExperience="
				+ cabExperience + ", complaint=" + complaint + ", query=" + query + "]";
	}

	
}
