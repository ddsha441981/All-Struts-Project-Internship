package org.spring.dao;

import java.util.List;

import org.spring.services.SignUp;

public interface Employeedao {

	public void add(SignUp signup);
	public List<SignUp> getall();
}
