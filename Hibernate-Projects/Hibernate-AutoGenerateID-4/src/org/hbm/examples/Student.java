package org.hbm.examples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Deendayal
 * @since 2 march 2017
 */

@Entity
@Table(name = "stdinfo")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int stdId;
	
	@Column(name = "StdName",nullable = false, length = 20)
	private String name;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
