package org.hbm.ManyToOne.example;

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
@Table(name = "stduentadd001")
public class StudentAddress {
	@Id
	@Column(name = "stduentaddId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int stdaddId;

	@Column(name = "stduentAddress")
	private String address;

	public int getStdaddId() {
		return stdaddId;
	}

	public void setStdaddId(int stdaddId) {
		this.stdaddId = stdaddId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
