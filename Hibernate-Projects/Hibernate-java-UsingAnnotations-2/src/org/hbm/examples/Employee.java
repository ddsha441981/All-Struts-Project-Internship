package org.hbm.examples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2 Class Employee
 */
@Entity
@Table(name = "Emp005")
public class Employee {

	@Id
	private int id;
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
