package org.spring.Beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


public class BeansClass {

	@NotEmpty
	@Size(min =4,max =10)
	private String username;
	@NotEmpty
	@Size(min =5,max =8)
	private String password;
	@NotEmpty
	@Length
	//@Pattern(regexp = "A-Z")
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
