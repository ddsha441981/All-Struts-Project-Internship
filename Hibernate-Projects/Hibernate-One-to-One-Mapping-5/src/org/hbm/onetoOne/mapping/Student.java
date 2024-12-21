package org.hbm.onetoOne.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Deendayal
 * @since 4 march 2017
 * @version 1.1.2
 */
@Entity
@Table(name = "studentcontents")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int stdId1;
	@Column(name = "stduentName",nullable = false)
	private String stdName;

	public int getStdId1() {
		return stdId1;
	}

	public void setStdId1(int stdId1) {
		this.stdId1 = stdId1;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

}
