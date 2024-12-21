package org.spring.controller;

import org.apache.log4j.Logger;
import org.spring.BeansClass.ChangePasswordAdminBeans;
import org.spring.Services.ChangePasswordAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChangePasswordAdminController {
	
	final public static Logger logger =Logger.getLogger("ChangePasswordAdminController.class");
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(ChangePasswordAdminController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(ChangePasswordAdminController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\DebugLog4J.properties";
	 
	
	@Autowired(required = true)
	ChangePasswordAdminService changePasswordAdminService;
	
	@RequestMapping(value = "/changeAdminPassword")
	public String changePasswordByAdmin(ChangePasswordAdminBeans changePasswordAdminBeans){
		
		System.out.println("Hello Change Password Controller");
		
		
		return "changePassWordadmin";
	}
	
	@RequestMapping(value = "/adminPasswordChangeUsingLogin")
	public String passwordAdmin(@ModelAttribute(value ="changePasswordAdminBeans")ChangePasswordAdminBeans changePasswordAdminBeans,Model model,BindingResult result){
		
		System.out.println("Hello Change Password Controller");
		
		ChangePasswordAdminBeans isExistEmailForAdmin = 	changePasswordAdminService.adminChangePassword(changePasswordAdminBeans);
		//System.out.println("Here Email is "+isExistEmailForAdmin.getEmail());
		if(isExistEmailForAdmin ==null){
			model.addAttribute("emailNotExits", "Email Id Not Found");
			return "Error";
		}
		else{
			
			int adminStatus = changePasswordAdminService.updatedPasswordForAdmin(changePasswordAdminBeans);
			
			System.out.println("Successfully Changed Password"+adminStatus);
			model.addAttribute("changePassword", "Your Password Succefully changed");
			
			model.addAttribute("changePasswordAdminBeans", new ChangePasswordAdminBeans());
		return "welcome";
		}
	}

}
