
package org.spring.beanclass;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int depId;
	private String depName;
	private int id;//login foriegn Key
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	

}
