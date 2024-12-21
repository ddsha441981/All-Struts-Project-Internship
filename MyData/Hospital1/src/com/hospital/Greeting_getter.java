package com.hospital;

public class Greeting_getter {

	int gid;
	String gname;
	String groom;
	String gsend;
	String msg;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGroom() {
		return groom;
	}
	public void setGroom(String groom) {
		this.groom = groom;
	}
	public String getGsend() {
		return gsend;
	}
	public void setGsend(String gsend) {
		this.gsend = gsend;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Greeting_getter [gid=" + gid + ", gname=" + gname + ", groom=" + groom + ", gsend=" + gsend + ", msg="
				+ msg + "]";
	}
	
}
