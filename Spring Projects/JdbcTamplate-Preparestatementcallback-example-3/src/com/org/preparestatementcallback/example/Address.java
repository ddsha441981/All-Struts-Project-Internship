package com.org.preparestatementcallback.example;

/** @author Deendayal */
public class Address {

	private String streetline;
	private String state;
	private String city;
	private String pincode;

	
	
	public Address(String streetline, String state, String city, String pincode) {
		super();
		this.streetline = streetline;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public String getStreetline() {
		return streetline;
	}

	public void setStreetline(String streetline) {
		this.streetline = streetline;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
