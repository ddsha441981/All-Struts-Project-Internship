package com.org.scopeOfbean.example;
/**@author Deendayal*/

public class Customer {

	private int customId;
	private String customName;
	
	public Customer(){
		System.out.println("Construtor call");
	}
	
	public void setCustomId(int customId) {
		this.customId = customId;
	}
	public int getCustomId() {
		return customId;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public String getCustomName() {
		return customName;
	}
	
}
