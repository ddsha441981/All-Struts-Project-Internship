package org.spring.agent.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.agent.beanofAgent.EnquiryofCustomers;
import org.spring.agent.beanofAgent.QuotationsBeans;
import org.spring.agent.repositries.QuotationsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 * class QuotationsController
 */
@Controller
public class QuotationsController {

	public static Logger logger = Logger.getLogger(QuotationsController.class);
	
	@Autowired
	QuotationsDao quotationdao;
	
	/**
	 * @RequestMapping(value="/returnReplyOfcustomers/{enquiryId}") used to mapping request
	 * qoutationsRequest() method name of Controller used to further processings
	 * AddnewPolicy bean class of policy
	 * quotationdao is daoclass object
	 * O1 objects of AddnewPolicy
	 * EnquiryId objects of AddnewPolicy
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/returnReplyOfcustomers/{enquiryId}")
	public String qoutationsRequest(@PathVariable Integer enquiryId ,AddnewPolicy P1,Model model,EnquiryofCustomers K1){
				
		//Log messages
		logger.info("Request successfully Mapped");
		
		EnquiryofCustomers O1 = quotationdao.fetchIdofEnquiries(enquiryId);
		 model.addAttribute("EnquiryId", O1);
		//Log messages
		logger.info("Record Selected successfully");
		
		List<AddnewPolicy> L1 = quotationdao.recordfetchofPolicy();
		model.addAttribute("agentsreply", L1);
		//Log messages
		logger.info("Record Selected successfully from addnewpolicy tables in List Format");
		
		return "quotationReply";
	}
	
	
	/**
	 *@RequestMapping(value="/agentsReplyToCustomers") used to mapping request
	 * qoutationsRequest() method name of Controller used to further processings
	 * QuotationsBeans bean class of policy
	 * quotationdao is daoclass object
	 * O1 objects of AddnewPolicy
	 * savecontentsofQuotations method to used save content in data base
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/agentsReplyToCustomers")
	public String qoutationsRequest(Model model,QuotationsBeans quotationbeans){
				
		//Log messages
		logger.info("Request successfully Mapped");
		
		 //quotationdao.newtableofQuations();
		
		//Log messages
		logger.info("Table created successfully");
		
		quotationdao.savecontentsofQuotations(quotationbeans);
			
		//Log messages
		logger.info("Data Save successfully");
		
		return "quotationReply";
	}
	
	/**
	 *@RequestMapping(value="/viewQuoationsByAgents") used to mapping request
	 * agentsCanview() method name of Controller used to further processings
	 * QuotationsBeans bean class of policy
	 * quotationdao is daoclass object
	 * P1 objects of QuotationsBeans
	 * viewContentsOfQuotationsByAgents method to used retrive content from data base
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/viewQuoationsByAgents")
	public String agentsCanview(Model model,QuotationsBeans quotationbeans){
				
		//Log messages
		logger.info("Request successfully Mapped");
		
		List<QuotationsBeans> P1 = quotationdao.viewContentsOfQuotationsByAgents();
		System.out.println(P1.toString());
			model.addAttribute("list", P1);
		//Log messages
		logger.info("Data Retrive successfully in list format");
		
		return "replyingByAgent";
	}
}
