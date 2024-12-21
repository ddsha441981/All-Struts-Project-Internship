package org.spring.controller;

import org.spring.bean.User;
import org.spring.repositoryImpl.WelcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Autowired(required=true)
	WelcomeRepository welcomeRepository;
	
	
@RequestMapping(value="/register")
public String userRegister(User user){
	System.out.println("I am in user register method");
	welcomeRepository.saveData(user);
	return "welcome";
}
	
}
