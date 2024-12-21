package com.first;

public class MyEmployee {

	private int empid;
	private String empname;
	private int empage;
	private int getEmpid() {
		return empid;
	}
	private void setEmpid(int empid) {
		this.empid = empid;
	}
	private String getEmpname() {
		return empname;
	}
	private void setEmpname(String empname) {
		this.empname = empname;
	}
	private int getEmpage() {
		return empage;
	}
	private void setEmpage(int empage) {
		this.empage = empage;
	}
	@Override
	public String toString() {
		return "MyEmployee [empid=" + empid + ", empname=" + empname + ", empage=" + empage + "]";
	}
	
	
	
	
}
