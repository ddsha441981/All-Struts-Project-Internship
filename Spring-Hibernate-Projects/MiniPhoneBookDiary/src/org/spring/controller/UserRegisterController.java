package org.spring.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.BeansClass.UserRegisterBeans;
import org.spring.Services.UserRegisterService;
import org.spring.utility.AutoGerneratedPassword;
import org.spring.utility.MailSending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserRegisterController {

	final public static Logger logger =Logger.getLogger(UserRegisterController.class);
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(UserRegisterController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(UserRegisterController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\DebugLog4J.properties";
	
	@Autowired(required = true)
	MailSending mailsending;
	
	@Autowired(required = true)
	UserRegisterService userRegisterService;
	
	@RequestMapping(value ="/userRegister")
	public String userRegisterPageRedirect(UserRegisterBeans userRegisterBeans){
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		PropertyConfigurator.configure(log4jerror);
		loggerError.error("Request Not Mapped");
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Request Not Mapped");
		return "userRegister";
	}
	
	@RequestMapping(value ="/registerUsers",method =RequestMethod.GET)
	public String userRegisterRedirect(@ModelAttribute(value="userRegisterBeans")UserRegisterBeans userRegisterBeans,Model model,BindingResult result){
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Request Not Mapped");
		
		String autoPassword = AutoGerneratedPassword.GeneratedPassword();
		userRegisterBeans.setAutoPassword(autoPassword);
		
		System.out.println("Auto Password is :" +autoPassword);
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Auto Generated Password generated successfully");
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Auto Generated Password Dubuging");
		
		int userId = userRegisterService.registerUserContents(userRegisterBeans);
		System.out.println("////////////////////////////"+userId);
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Email Sending Code Dubuging");
		
		if(userId>0){
			
			
			String toEmail = ("EmailId:"+userRegisterBeans.getEmail());
			String sub = "User Register SuccessFully";
			System.out.println(toEmail);
			String subject=(sub);
			String body=("Welcome "+userRegisterBeans.getUsername()+" Your Registeration SuccessFully Done\n\n\n "+"EmailID :- " +userRegisterBeans.getEmail()+"\n"+"Auto Generated Password :- " +userRegisterBeans.getAutoPassword()+" ");
			System.out.println(subject);
			System.out.println(body);
			model.addAttribute("Validemail","We've sent login credentials to your mail");
			//mailSender.mailsending(emailsending.getEmail(), subject, body);
			mailsending.mailsend(userRegisterBeans.getEmail(), subject, body);
			
			PropertyConfigurator.configure(log4jmsg);
			logger.info("Email Sending Successfully Done");
			
			model.addAttribute("userRegisterBeans", new UserRegisterController());
			
			return "welcome";
		}
		else{
			
			PropertyConfigurator.configure(log4jerror);
			loggerError.error("Data Doesn't  inserted");
			
			return "error";
		}
		
	}
	
}
