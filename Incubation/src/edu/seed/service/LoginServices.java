package edu.seed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.seed.dto.LoginBean;
import edu.seed.dto.RegistrationBean;
import edu.seed.repository.LoginDao;


@Service
public class LoginServices {

@Autowired(required=true)
LoginDao loginRepository;


/**
 @ author :Abhay singh solanki

 @ since :march 13-2017 */



public LoginBean login(LoginBean loginBean)
{
	System.out.println("In service method");
	return loginRepository.login(loginBean);
}


	
}
