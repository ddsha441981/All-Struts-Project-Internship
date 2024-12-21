package com.org.preparestatementcallback.example;

/** @author Deendayal */
public class BasicDetailsofStudent {

	private int stId;
	private String name;
	private int age;
	private String stream;
	private String year;

	
	
	public BasicDetailsofStudent(int stId, String name, int age, String stream, String year) {
		super();
		this.stId = stId;
		this.name = name;
		this.age = age;
		this.stream = stream;
		this.year = year;
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
