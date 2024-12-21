package org.hbm.onetoOne.mapping;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author Deendayal
 * @since 4 march 2017
 * @version 1.1.2
 */
@Entity
@Table(name ="studentdetail")
public class Studentdetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)//Name of primary key generator
	@GenericGenerator(name ="newGenerator",strategy ="foreign",parameters = {@Parameter(value = "student",name="property")})
	
	private int stdId1;
	
	@Column(name ="stdMobileNo",nullable = false)
	private String mob;
	
	@Column(name = "DateofBirth",nullable = false)
	private Date dob;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentId")
	private Student student; //student class object 
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getStdId1() {
		return stdId1;
	}

	public void setStdId(int stdId1) {
		this.stdId1 = stdId1;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}
