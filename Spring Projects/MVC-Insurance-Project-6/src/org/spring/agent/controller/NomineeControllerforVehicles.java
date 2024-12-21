package org.spring.agent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.agent.beanofAgent.HealthNomineeBeans;
import org.spring.agent.beanofAgent.VehiclesNomineeBeans;
import org.spring.agent.repositries.NomineeDaoforVehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Deendayal
 * @since 2017
 * @version 1.1.2
 */
/** This class is NomineeControllerforVehicles class
 *  some methods delcared
 *  Used Logger
 */
@Controller
public class NomineeControllerforVehicles {

	public static Logger logger = Logger.getLogger(NomineeControllerforVehicles.class);
	
	@Autowired 
	NomineeDaoforVehicles daonomineeVehicles;
	
	/**
	 *@RequestMapping(value="/vehiclesNominees") used to mapping request
	 * nomineeContentsOfVehicle() method name of Controller used to further processings
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/vehiclesNominees/{clientId}")
	public String nomineeContentsOfVehicle(@PathVariable Integer clientId,Model model){
		//logs message
			logger.info("Request Mapping SuccessfullyS");
			
			List<AddnewPolicy> listpolicy = daonomineeVehicles.contentretriveofPoliciesfromDatabase();
			model.addAttribute("list", listpolicy);
			
			//logs message
			logger.info("Policies Successfully Retrive from Database");
		
			List<VehiclesNomineeBeans> nomineeList = daonomineeVehicles.clientsNomieesretrive(clientId);
			model.addAttribute("listofNominees", nomineeList);
			
			//logs message
			logger.info("Policies Successfully Retrive from Database");
			
		return "vehicleNomineePage";
	}
	
	/**
	 *@RequestMapping(value="/vehiclesNominees") used to mapping request
	 * nomineeContentsOfVehicle() method name of Controller used to further processings
	 * Model used to pass object from java class to jsp page and contents display
	 * 
	 */
	@RequestMapping(value="/vehicleNomineesave",method=RequestMethod.POST)
	
	public String saveNomineeDetails(VehiclesNomineeBeans vehiclesNominee,Model model,HttpServletRequest request){
		//logs message
		  logger.info("Request Mapping Successfully");
		
		//  daonomineeVehicles.createtableofNomineeDetailsOfVehicles();
		
		//logs message
		  logger.info("Table Created Successfully");
		
		//logs message
		  logger.info("Records Of Nominee Successfully Store in database");
		  
		  int clientId = (int) request.getSession().getAttribute("clientOfId");
		  
		  vehiclesNominee.setClientId(clientId);
		  
		  daonomineeVehicles.contentsofVehiclsNominee(vehiclesNominee);
		  
		return "vehicleNomineePage";
		
	}
}
