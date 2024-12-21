package org.hbm.student.examples;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author Deendayal
 * @since 2 march 2017
 */

@Entity
@Table(name = "studentinfo2")
public class StudentInfo {

	/**
	 *@Id when id is auto generate or not
	 */
	@Id
	private int stduentId;

	/**
	 *@Transient when remove this name from database use this annotations
	 *nullable = false is given that column name is not null
	 *@Column given column name of table in the database
	 */
	//@Transient
	@Column(name = "Name",nullable = false)
	private String studentName;
	/**
	 *@Transient when remove this name from database use this annotations
	 *nullable = false is given that column name is not null
	 *@Column given column name of table in the database
	 */
	@Column(name = "Age", nullable = false)
	private int studentAge;

	@Temporal(TemporalType.DATE)
	@Column(name ="dateofBirth")
	private Date dob;
	
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getStduentId() {
		return stduentId;
	}

	public void setStduentId(int stduentId) {
		this.stduentId = stduentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

}
