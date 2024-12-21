package org.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.spring.beans.UserLoginBeans;
import org.spring.services.UserLoginServices;
import org.spring.utility.AutogeneratedPassword;
import org.spring.utility.MailSending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller

public class UserLoginController {
	
	@Autowired(required = true)
	UserLoginServices userLoginServices;
	
	@Autowired(required = true)
	MailSending mailSending;
	
	/** User Login Credintails*/
	
	@RequestMapping(value = "/userLoginCredintails",method =RequestMethod.POST)
	public String loginUser(UserLoginBeans userLoginBeans,HttpServletRequest request){
		
		
	int count =	userLoginServices.userLoginContent(userLoginBeans);
		
	if(count > 0){
		//Here Session Set
		request.getSession().setAttribute("userId", count);
		return "userProfile";
	}
	else{
	
		return "Error";
	}
	
	
	}
	
	
	@RequestMapping(value = "/loginofUser")
	
	public String userSave(UserLoginBeans userLoginBeans){
		
		
		//Auto Generated Password
		String password = AutogeneratedPassword.GeneratedPassword();
		userLoginBeans.setPassword(password);
		System.out.println("In User Login Controller \\\\  " + password);
		int count = userLoginServices.saveUserLoginContent(userLoginBeans);
		//int count =0;
		if(count > 0){
			String toEmail = ("EmailId:"+userLoginBeans.getEmail());
			String sub = "User Register SuccessFully";
			System.out.println(toEmail);
			String subject=(sub);
			String body=("Welcome "+userLoginBeans.getName()+" Your Registeration SuccessFully Done\n\n\n "+"EmailID :- " +userLoginBeans.getEmail()+"\n"+"Auto Generated Password :- " +userLoginBeans.getPassword()+" ");
			System.out.println(subject);
			System.out.println(body);
			
			//mailSender.mailsending(emailsending.getEmail(), subject, body);
			mailSending.mailsend(userLoginBeans.getEmail(), subject, body);
			
			return "userProfile";//index replace here
		}
		else{
		
			return "Error";
		}
		
	}
	
	@RequestMapping("/ProfileUpdateProcessByUser")
	public String viewSingleUserProfile(UserLoginBeans userLoginBeans,HttpServletRequest request){
		
		// we get Session Here
		int userId = (int) request.getSession().getAttribute("userId");
		userLoginBeans.setUserId(userId);
		
		userLoginServices.userSingleProfile(userLoginBeans);
		return null;
		
	}
}
