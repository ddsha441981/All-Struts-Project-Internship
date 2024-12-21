package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HRController {

	
	
	
	@RequestMapping(value ="/requestPageGoTo")
	public String gotoRequestPage(){
		
		return "requestPage";
	}
	
	/*@RequestMapping(value ="submitrequestPage")
	public String RequestPagesubmit(){
		
		return "welcome";
	}*/
	
	@RequestMapping(value ="/requestDetails")
	public String gotoRequestPageDetails(){
		
		return "viewDetailsrequestPage";
	}
	
	@RequestMapping(value ="/verficationGoto")
	public String gotoVerificationPage(){
		
		return "verficationData";
	}
	
	@RequestMapping(value ="/verificationDetails")
	public String gotoVerificationDetails(){
		
		return "viewVerificationdetails";
	}
	
	
	@RequestMapping(value ="/notificationGoto")
	public String gotoNotiFicationsPage(){
		
		return "notification";
	}
	
	@RequestMapping(value ="/notificationDetails")
	public String notificationDetails(){
		
		return "viewNotificationDetails";
	}
	
	
}
