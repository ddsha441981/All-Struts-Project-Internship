package org.spring.agent.controller;
/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 */

/** This class is EnquiryController class
 *  some methods delcared
 *  Used Logger
 */
import java.util.List;

import org.apache.log4j.Logger;
import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.admin.beanclasses.RegisterAgent;
import org.spring.agent.beanofAgent.EnquiryofCustomers;
import org.spring.agent.repositries.EnquiryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EnquiryController {
	

	public static Logger logger = Logger.getLogger(EnquiryController.class);
	
	@Autowired
	EnquiryDao enquirydao;
	
	/**
	 * @RequestMapping(value="/enquiryInControllers") used to mapping request
	 * enquiryBycustomers() method name of Controller used to further processings
	 * AddnewPolicy bean class of policy
	 * RegisterAgent bean class of Agents
	 * enquirydao is daoclass object
	 * equiryListofPolicy objects of AddnewPolicy
	 * listofAgents objects of AddnewPolicy
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/enquiryInControllers")
	public String enquiryBycustomers(AddnewPolicy G1,RegisterAgent M1,Model model){
		//logs messages
		logger.info("Request Successfully Mapping In Controller of Enquiry by Customers");
		
		List<AddnewPolicy> equiryListofPolicy = enquirydao.viewallOfpolicyUsingEnquiry();
		model.addAttribute("listofpolicyToEquiry", equiryListofPolicy);
		
		//logs messages
		logger.info("List of Policies Retrive Successfully from DataBase for Enquirying  Customers about policies");
		
		List<RegisterAgent> listofAgents = enquirydao.listofAgentUsingEquiry();
		model.addAttribute("agentslistToEquiry", listofAgents);
		
		//logs messages
		logger.info("List of Agents Retrive Successfully from DataBase for Choosing Agent by Customers to policies");
		
		return "enquiry";
	}
	

	/**
	 * @RequestMapping(value="/enquirybyCustomers") used to mapping request
	 * enquirycontents() method name of Controller used to further processings
	 * enquirydao is daoclass object
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/enquirybyCustomers",method=RequestMethod.POST)
	public String enquirycontents(Model model,EnquiryofCustomers enquiries){
		//logs messages
		logger.info("Request Successfully Mapping In Controller of Enquiry by Customers");
		
		//enquirydao.creattableofenquiry();
		//logs messages
		logger.info("Table Created SuccessFully");
		
		enquirydao.savecustomEnquiry(enquiries);
		//logs messages
		logger.info("Record SuccessFully Save in Database");
		
		return "agentprofile";
	}
	
	/**
	 * @RequestMapping(value="/enquiriesofPolicyViewAgent/{aId}") used to mapping request
	 * viewagentscustomersEnquiry() method name of Controller used to further processings
	 * enquirydao is daoclass object
	 * Model used to pass object from java class to jsp page and contents display
	 * Return type is List
	 */
	@RequestMapping(value="/enquiriesofPolicyViewAgent/{aId}")
	public String viewagentscustomersEnquiry(@PathVariable Integer aId ,Model model,EnquiryofCustomers enquiries){
		//logs messages
		logger.info("Request Successfully Mapping In Controller of Enquiry by Customers");
		
		List<EnquiryofCustomers> lists= enquirydao.viewsAgentsEnquiryDataofCustomers(aId);
		//logs messages
		logger.info("Record selected  SuccessFully using Id");
		model.addAttribute("agentSelectedUsingId", lists);
		return "viewAllofEnquiriesByAgent";
	}
}
