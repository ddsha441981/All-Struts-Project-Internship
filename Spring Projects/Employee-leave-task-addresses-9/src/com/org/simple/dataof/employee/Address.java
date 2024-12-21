package com.org.simple.dataof.employee;
/**@author Deendayal*/
public class Address {
	
	private int aId;
	private String pin;
	private String city;
	private String state;
	private String country;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", pin=" + pin + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
	
	
	
}
