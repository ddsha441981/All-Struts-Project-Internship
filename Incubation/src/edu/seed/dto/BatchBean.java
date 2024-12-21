package edu.seed.dto;

import java.sql.Date;

public class BatchBean 
{
	private int b_id;
	private String b_name;
	private Date b_startdate;
	private Date b_enddate;
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public Date getB_startdate() {
		return b_startdate;
	}
	public void setB_startdate(Date b_startdate) {
		this.b_startdate = b_startdate;
	}
	public Date getB_enddate() {
		return b_enddate;
	}
	public void setB_enddate(Date b_enddate) {
		this.b_enddate = b_enddate;
	}
	public int getPm_id() {
		return pm_id;
	}
	public void setPm_id(int pm_id) {
		this.pm_id = pm_id;
	}
	public String getB_status() {
		return b_status;
	}
	public void setB_status(String b_status) {
		this.b_status = b_status;
	}
	private int pm_id;
	private String b_status;


}
