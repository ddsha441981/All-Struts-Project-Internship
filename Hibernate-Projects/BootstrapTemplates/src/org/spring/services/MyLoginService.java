package org.spring.services;

import org.spring.Bean.LoginBeans;
import org.spring.repositaries.LoginReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyLoginService {

	@Autowired(required = true)
	LoginReposi loginreposi;
	
	
	public int vaildLoginUser(LoginBeans logins)
	{
		
		System.out.println("In Service");
		
		return loginreposi.vaildLoginUser(logins);
		
	}
}
