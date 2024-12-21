package edu.seed.dto;

import java.sql.Date;

public class GroupBean {

	@Override
	public String toString() {
		return "BID : "+b_id+" - BNAME"+b_name+"\n";
	}
	
	private int pm_id;
	private String b_name;
	private String name;
	private int userid;
	private String intern_id;
	
	
	
	
	
	
	public String getIntern_id() {
		return intern_id;
	}
	public void setIntern_id(String intern_id) {
		this.intern_id = intern_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private int g_id;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

	private String g_name;
	private Date g_startdate;
	private String g_status;
	private int b_id;
	public int getG_id() {
		return g_id;
	}
	public void setG_id(int g_id) {
		this.g_id = g_id;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public Date getG_startdate() {
		return g_startdate;
	}
	public void setG_startdate(Date g_startdate) {
		this.g_startdate = g_startdate;
	}
	public String getG_status() {
		return g_status;
	}
	public void setG_status(String g_status) {
		this.g_status = g_status;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public int getPm_id() {
		return pm_id;
	}
	public void setPm_id(int pm_id) {
		this.pm_id = pm_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	
	private int p_id;
	
}
