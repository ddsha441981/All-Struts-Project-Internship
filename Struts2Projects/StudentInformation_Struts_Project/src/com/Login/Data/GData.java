package com.Login.Data;

public class GData {

	String plateform;
	String language;
	String tech;
	String ff;
	public String getPlateform() {
		return plateform;
	}
	public void setPlateform(String plateform) {
		this.plateform = plateform;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getFf() {
		return ff;
	}
	public void setFf(String ff) {
		this.ff = ff;
	}
	
	public String execute()
	{
		return "Success";
	}
}
