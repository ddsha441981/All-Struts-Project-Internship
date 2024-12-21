package org.spring.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.spring.BeansClass.ContactUserBeans;
import org.spring.BeansClass.UserRegisterBeans;
import org.spring.Services.AdminviewUserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminViewsUsersListController {

	final public static Logger logger =Logger.getLogger("AdminViewsUsersListController.class");
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(AdminViewsUsersListController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(AdminViewsUsersListController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\DebugLog4J.properties";
	 
	 @Autowired(required = true)
	 AdminviewUserListService adminViewListServices;
	 
	 @RequestMapping(value ="/viewUseraCCountDetails")
	 public String adminViewUserList(UserRegisterBeans userRegisterBeans,Model model){
		// System.out.println("In Controller of Admin");
		
		List<UserRegisterBeans> userList =  adminViewListServices.adminViewListUserList(userRegisterBeans);
		 model.addAttribute("userList", userList);
		
		 return "userListforAdmin";
	 }
	 
	 @RequestMapping(value="/ViewContactsById/{userId}")
	 public String viewListContactByAdmin(ContactUserBeans contactUserBeans,@PathVariable Integer userId,Model model){
		 
	//	System.out.println("In Admin Controller"+userId);
		contactUserBeans.setUserId(userId);
		List<ContactUserBeans> contactList = adminViewListServices.adminViewContactsListById(userId); 
		model.addAttribute("contactList", contactList);
		//System.out.println("####################"+contactList.toString());
		return "viewAllContactsByAdmin";
	 }
}
