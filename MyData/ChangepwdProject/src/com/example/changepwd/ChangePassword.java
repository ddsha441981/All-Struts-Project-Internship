package com.example.changepwd;

public class ChangePassword {
	int pass_id;
	String pwd1;
	String cpwd1;
	String newpwd1;
	
	public int getPass_id() {
		return pass_id;
	}
	public void setPass_id(int pass_id) {
		this.pass_id = pass_id;
	}
	public String getPwd1() {
		return pwd1;
	}
	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}
	public String getCpwd1() {
		return cpwd1;
	}
	public void setCpwd1(String cpwd1) {
		this.cpwd1 = cpwd1;
	}
	public String getNewpwd1() {
		return newpwd1;
	}
	public void setNewpwd1(String newpwd1) {
		this.newpwd1 = newpwd1;
	}
	
	
	public String changepwdofiN(){
		
		int j = DAOchangePass.mypwdchange(this);
		if(j > 0){
			return "success";
		}
		else {
			return "error";
		}
		
		
		
	}
	
	

}
