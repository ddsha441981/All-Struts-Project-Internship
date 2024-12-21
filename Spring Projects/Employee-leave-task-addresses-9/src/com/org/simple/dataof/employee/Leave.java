package com.org.simple.dataof.employee;
/**@author Deendayal*/
public class Leave {

	private int lId;
	private String des;
	private String startdate;
	private String enddate;
	
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	@Override
	public String toString() {
		return "Leave [lId=" + lId + ", des=" + des + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}
	
	
	
	
}
