package org.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.BeansClass.ContactUserBeans;
import org.spring.BeansClass.SearchContactBeans;
import org.spring.Services.ContactUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactUserController {

	final public static Logger logger =Logger.getLogger("ContactUserController.class");
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(ContactUserController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(ContactUserController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\DebugLog4J.properties";
	 
	
	@Autowired(required = true)
	ContactUserServices contactUserServices;
	
	@RequestMapping(value="/addNewContacts")
	public String newContactsAdd(HttpServletRequest request,ContactUserBeans contactUserBeans,Model model){
		
		int userId = (int) request.getSession().getAttribute("userId");
		contactUserBeans.setUserId(userId);
		System.out.println("In Contact Contraller"+userId);
				
		List<ContactUserBeans> list= contactUserServices.listOfUserContactData(contactUserBeans);
		
		//System.out.println("Here List is"+list.toString());
		model.addAttribute("contactList", list);
		//model.addAttribute("contactUserBeans", new ContactUserBeans());
		
		return "addNewContactsList";
	}
	
	@RequestMapping(value="/contactSave")
	public String ContactsAdd(@ModelAttribute(value ="contactUserBeans") ContactUserBeans contactUserBeans,Model model,BindingResult result,HttpServletRequest request){
		
		System.out.println("In Main Contraller");
		int userId = (int) request.getSession().getAttribute("userId");
		
		contactUserBeans.setUserId(userId);
		
		contactUserServices.addNewContactsSave(contactUserBeans);
		
		model.addAttribute("contactUserBeans", new ContactUserBeans());
		return "welcome";
	}
	
	@RequestMapping(value = "/contactDeleteById/{contactId}")
	public String deleteContactById(@ModelAttribute(value ="contactUserBeans") ContactUserBeans contactUserBeans,@PathVariable Integer contactId,Model model,BindingResult result){
		System.out.println("Here Delete Controller UserId is"+contactId);
		contactUserBeans.setContactId(contactId);
		 int deleteId = contactUserServices.deleteUsingById(contactId);
		System.out.println("Here Delete Id is "+deleteId);
		
		return "addNewContactsList";
	}
	
	
	@RequestMapping(value = "/contactEditById/{contactId}")
	public String selectedDataforUpdate( ContactUserBeans contactUserBeans,@PathVariable Integer contactId,Model model,BindingResult result){
		//System.out.println("Here update Controller contactId is"+contactId);
		contactUserBeans.setContactId(contactId);
		ContactUserBeans selectedObj = contactUserServices.selectedDataForEditById(contactId);
		//System.out.println("Here Updated Id is "+selectedObj);
		model.addAttribute("obj", selectedObj);
		
		return "editUserContact";
	}
	
	@RequestMapping(value ="/contactUpdate",method=RequestMethod.GET)
	public String newUpdateOfUser(@ModelAttribute(value ="contactUserBeans") Model model,ContactUserBeans contactUserBeans,BindingResult result){
		System.out.println(contactUserBeans.getContactId());
		System.out.println("In Update Controller");
		model.addAttribute("contactUserBeans", new ContactUserBeans());
		return "welcome";
	}
	
	
	
}
