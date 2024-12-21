package edu.seed.dto;

import java.sql.Date;

public class PlacementBean {
	
	
	private int pl_id;
	private Date interview_date;
	private String company_name;
	private String status;
	private String description;
	private int userid;
	public int getPl_id() {
		return pl_id;
	}
	public void setPl_id(int pl_id) {
		this.pl_id = pl_id;
	}
	public Date getInterview_date() {
		return interview_date;
	}
	public void setInterview_date(Date interview_date) {
		this.interview_date = interview_date;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	

}
