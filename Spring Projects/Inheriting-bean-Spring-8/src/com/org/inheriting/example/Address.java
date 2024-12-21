package com.org.inheriting.example;
/**@author Deendayal*/
public class Address {
	
	private String addressLine1;
	private String city;
	private String state;
	private String country;
	
	public Address(){
		System.out.println("default constructor of Address");
	}
	
	public Address(String addressLine1, String city, String state,String country){
		super();
		this.addressLine1 = addressLine1;
		this.city = city;
		this.country = country;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}

}
