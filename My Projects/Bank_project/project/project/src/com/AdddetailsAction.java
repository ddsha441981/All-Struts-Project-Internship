package com;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AdddetailsAction extends ActionSupport implements SessionAware
{
	private String fname;
	private String lname;
	private String certificate;
	private String specailist;
	private String country;
	Map map;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getSpecailist() {
		return specailist;
	}

	public void setSpecailist(String specailist) {
		this.specailist = specailist;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String execute() throws Exception {
		int i = AddDetailcon.db(this);
		if (i > 0) {
			return SUCCESS;
		}
		return INPUT;

	}

	@Override
	public void setSession(@SuppressWarnings("rawtypes") Map arg0) {
		map = arg0;

	}

	

}
