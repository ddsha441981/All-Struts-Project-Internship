package org.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.BeansClass.LoginBeans;
import org.spring.BeansClass.SearchContactBeans;
import org.spring.BeansClass.UserRegisterBeans;
import org.spring.Services.AdminLoginServices;
import org.spring.Services.UserLoginService;
import org.spring.repositry.UserLoginDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginPageController {
	
	final public static Logger logger =Logger.getLogger("LoginPageController.class");
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(LoginPageController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(LoginPageController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\DebugLog4J.properties";
	 
	
	@Autowired(required = true)
	AdminLoginServices adminLoginServices;
	
	@Autowired(required = true)
	UserLoginService userLoginservice;
	
	@RequestMapping(value ="/goToLinkPage",method =RequestMethod.GET)
	public String pageNextredirect(Model model){
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Page Redirect Request Mapping SuccessFully done");
		
		PropertyConfigurator.configure(log4jerror);
		loggerError.error("Request Not Mapped");
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Request Mapping Dubuging");
		
		model.addAttribute("loginBeans", new LoginBeans());
		
		return "index";
	}
	
	@RequestMapping(value ="/loginRedirectPage",method = RequestMethod.GET)
	public String loginPage(@ModelAttribute(value = "loginBeans") @Valid LoginBeans loginBeans,Model model,BindingResult result,UserRegisterBeans userRegisterBeans,HttpServletRequest request){
		
		/*if(result.hasErrors()){
			return "index";
		}
		else{*/
		if(loginBeans.getUserRole().equalsIgnoreCase("admin")){
			
			PropertyConfigurator.configure(log4jmsg);
			logger.info("Admin Login Request Mapping SuccessFully done");
			
			PropertyConfigurator.configure(log4jerror);
			loggerError.error("Admin Role not selected Properly");
			
			PropertyConfigurator.configure(log4jdebug);
			loggerDebug.debug("Request Mapping Dubuging");
			
			adminLoginServices.adminLoginRedirect(loginBeans);
			
			model.addAttribute("loginBeans", new LoginBeans());
			model.addAttribute("loginContents", "Login SuccessFully");
			
			return "adminProfile";
		}
		else if(userRegisterBeans.getUserRole().equalsIgnoreCase("user")){
			
			PropertyConfigurator.configure(log4jmsg);
			logger.info("User Login Request Mapping SuccessFully done");
			
			PropertyConfigurator.configure(log4jerror);
			loggerError.error("User Role not selected Properly");
			
			PropertyConfigurator.configure(log4jdebug);
			loggerDebug.debug("Request Mapping Dubuging");
			
		int userId = userLoginservice.loginCrentials(userRegisterBeans);
		if(userId>0){
			
			request.getSession().setAttribute("userId", userId);
		//	model.addAttribute("loginBeans", new LoginBeans());
			model.addAttribute("userId", userId);
			
			return "userProfile";
		}
		else {
			
			PropertyConfigurator.configure(log4jdebug);
			loggerDebug.debug("Session Id Is  Dubuging");
			PropertyConfigurator.configure(log4jerror);
			logger.error("Its seems session Id is Not presenent");
			return "Error";

		}
			
		}
		else{
			
			PropertyConfigurator.configure(log4jdebug);
			loggerDebug.debug("Request Mapping Dubuging");
			PropertyConfigurator.configure(log4jerror);
			logger.error("You Get Error");
			/*loggerError.error("Not selected Properly");*/
			return "Error";
		}
		
		
		/*return "welcome";
		}*/
	}
	
}
