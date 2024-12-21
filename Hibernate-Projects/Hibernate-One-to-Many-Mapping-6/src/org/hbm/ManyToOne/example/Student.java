package org.hbm.ManyToOne.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Deendayal
 * @since 4 march 2017
 * @version 1.1.2
 */
@Entity
@Table(name = "students001")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "stduentId", nullable = false)
	private int stdId;

	@Column(name = "studentName", nullable = false)
	private String Name;

	/**Here use to many to one steps*/
	@ManyToOne(cascade =CascadeType.ALL)
	private StudentAddress stdaddress;

	public StudentAddress getStdaddress() {
		return stdaddress;
	}

	public void setStdaddress(StudentAddress stdaddress) {
		this.stdaddress = stdaddress;
	}
	
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	

}
