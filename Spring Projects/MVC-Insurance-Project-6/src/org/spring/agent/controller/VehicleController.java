package org.spring.agent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.agent.beanofAgent.PolicyHolderRegister;
import org.spring.agent.beanofAgent.PolicyHoldersandAgentdata;
import org.spring.agent.beanofAgent.VehicleInsuranceBean;
import org.spring.agent.repositries.VehicleInsuranceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Deendayal
 * @version 1.1.2
 * @since 2017
 * * The Class VehicleController.
 */
@Controller
public class VehicleController {
	@Autowired(required=true)
	VehicleInsuranceDao vehicle;
	public static final Logger logger = Logger.getLogger(VehicleController.class);

	/**
	 *  selectToviewDataUsingJoins() is method name of controller
	 *  PolicyHoldersandAgentdata class name of client and Agent data defines
	 *  Request Mapping when Agent register vehicle insurance vehicleInsurancesave
	 *  selectJoindata insurance  form action
	 *  Used model to show some message
	 *  Return type is String and return addnewInsurance.jsp page
	 */
	@RequestMapping(value = "/selectJoindata/{clientId}")
	public String selectToviewDataUsingJoins(@PathVariable Integer clientId, PolicyHoldersandAgentdata joinsdata,Model model,HttpServletRequest request) {
		// logs messages
		logger.info("Select Method Executing......");

		PolicyHoldersandAgentdata joinsvalues = vehicle.usingJoinsretriveData(clientId);
		// logs messages
		logger.info("Record Selected Successfully......");

		model.addAttribute("retrivevalues", joinsvalues);
		
		// logs messages
		logger.info("Record Selected Successfully......");
		
		
		int agentId = (int) request.getSession().getAttribute("aId");
		System.out.println("Here AgentId is "+agentId);
		List<VehicleInsuranceBean> H1 = vehicle.selectRecordInListFormat(agentId);
		model.addAttribute("vehicleContents", H1);
		
		// logs messages
		logger.info("Record Selected Successfully......");
		
		return "addnewInsurance";

	}
	
	/**
	 *  agent() is method name of controller
	 *  tableOfvehicles() method used to save data in Database for Particular client Using Their Id
	 *  Request Mapping when Agent register vehicle insurance vehicleInsurancesave
	 *  vehicle insurance  form action
	 *  Used model to show some message
	 *  Return type is String and return addnewInsurance.jsp page
	 */
	@RequestMapping(value = "/vehicleInsurancesave", method = RequestMethod.POST)

	public String tableOfvehicles(VehicleInsuranceBean vehiclesContents) {
		// logs messages
		logger.info("Insert Method Executing......");
		System.out.println("In Method");

		// vehicle.TableOfvehicle();
		// logs messages
		logger.info("Table Created SuccessFully......");

		vehicle.saveContentsOfVehicles(vehiclesContents);
		// logs messages
		logger.info("Record Inserted SuccessFully......");
		System.out.println("Data Insert SuccessFully");
		return "addnewInsurance";

	}
}
