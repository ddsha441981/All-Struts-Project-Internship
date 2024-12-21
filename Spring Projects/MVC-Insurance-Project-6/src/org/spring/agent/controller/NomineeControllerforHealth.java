package org.spring.agent.controller;
/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 */

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.agent.beanofAgent.HealthNomineeBeans;
import org.spring.agent.repositries.NomineeforHealthDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** This class is NomineeControllerforHealth class
 *  some methods delcared
 *  Used Logger
 */
@Controller
public class NomineeControllerforHealth {

	public static Logger logger = Logger.getLogger(NomineeControllerforHealth.class);

	@Autowired
	NomineeforHealthDao daonomineeHealth;
	
	/**
	 *@RequestMapping(value="/vehiclesNominees") used to mapping request
	 * nomineeContentsOfVehicle() method name of Controller used to further processings
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/healthNominees/{clientId}")
	public String nomineeContentsOfVehicle(@PathVariable Integer clientId,AddnewPolicy policy,Model model){
		//logs message
			logger.info("Request Mapping SuccessfullyS");
		
		
		List<AddnewPolicy> listpolicy = daonomineeHealth.fetchpolicyForAddingNominees();
		model.addAttribute("list", listpolicy);
		
		//logs message
		logger.info("Policies Successfully Retrive from Database");
		
		List<HealthNomineeBeans> nomineeList = daonomineeHealth.clientsNomieesretrive(clientId);
		model.addAttribute("listofNominees", nomineeList);
		
		//logs message
		logger.info("Policies Successfully Retrive from Database");
		
		return "nomineehealthPage";
	}
	
	/**
	 *@RequestMapping(value="/vehiclesNominees") used to mapping request
	 * nomineeContentsOfVehicle() method name of Controller used to further processings
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/healthNomineesave",method=RequestMethod.POST)
	
	public String saveNomineeDetails(HealthNomineeBeans healthNominee,Model model,HttpServletRequest request){
		//logs message
		  logger.info("Request Mapping Successfully");
		
		 // daonomineeHealth.createtableofNomineeDetails();
		
		//logs message
		  logger.info("Table Created Successfully");
		
		//logs message
		  logger.info("Records Of Nominee Successfully Store in database");
		  
		  int clientId = (int) request.getSession().getAttribute("clientOfId");
		  
		  healthNominee.setClientId(clientId);
		  
		 daonomineeHealth.saveDeatilsOfNominees(healthNominee);
		  
		return "nomineehealthPage";
		
	}
}
