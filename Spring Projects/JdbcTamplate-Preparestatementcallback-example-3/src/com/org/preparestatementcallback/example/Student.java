package com.org.preparestatementcallback.example;

/** @author Deendayal */
public class Student {

	private  String school;
	private  String schooladd;

	private Address address;
	private BasicDetailsofStudent basic;

	
	
	public Student(String school, String schooladd) {
		//super();
		this.school = school;
		this.schooladd = schooladd;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchooladd() {
		return schooladd;
	}

	public void setSchooladd(String schooladd) {
		this.schooladd = schooladd;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BasicDetailsofStudent getBasic() {
		return basic;
	}

	public void setBasic(BasicDetailsofStudent basic) {
		this.basic = basic;
	}

}
