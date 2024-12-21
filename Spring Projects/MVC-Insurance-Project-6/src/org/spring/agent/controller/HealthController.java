package org.spring.agent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.admin.beanclasses.RegisterAgent;
import org.spring.agent.beanofAgent.HealthInsurnceBeans;
import org.spring.agent.repositries.HealthDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Deendayal
* @since
* @version 1.1.2
*/

/** This class is Controller class
*  some methods delcared
*  Used Logger
*  Class HealthController
*/
@Controller
public class HealthController {
	
	Logger logger = Logger.getLogger(HealthController.class);
	@Autowired(required = true)
	HealthDao healthdao;
	
	/**
	 * @RequestMapping(value="/healthInsurancebyAgents/{agentId}") Request Mapping
	 * healthContents is method of Controller to further process
	 * RegisterAgent class of Agent
	 * */
	@RequestMapping(value="/healthInsurancebyAgents/{agentId}")
	public String healthContents(@PathVariable Integer agentId, RegisterAgent JQ,Model model){
		//logs message
			logger.info("Form Request Successfully Mapping");
		
		RegisterAgent JQS = healthdao.retriveAgentsDetails(agentId);
		
		model.addAttribute("listOfAgents", JQS);
		//logs message
			logger.info("Records of Agents Retrive From Database Successfully");
	
		List<HealthInsurnceBeans> allofContentshealths = healthdao.retriveContentsofHealthByagents(agentId);
		
		model.addAttribute("listofHeaths", allofContentshealths);
		//logs message
			logger.info("Records of Healths Retrive From Database Successfully using By Id");
		return "healthInsurance";
		
	}
	
	/**
	 * @RequestMapping(value="/healthInfoSave") Request Mapping
	 * healthsaveMethods is method of Controller to further process
	 * HealthInsurnceBeans class of HealthInsurance
	 * */
	@RequestMapping(value="/healthInfoSave")
	public String healthsaveMethods(HealthInsurnceBeans healthInsurance,Model model,HttpServletRequest request){
		//logs message
		logger.info("Form Request Successfully Mapping");
		
		//healthdao.heathcreatingTables();
		//logs message
		logger.info("Created Tables successfully of Health Insurance");
		
		int agentId = (int) request.getSession().getAttribute("aId");
		healthInsurance.setAgentId(agentId);
		int clientId = (int) request.getSession().getAttribute("clientOfId");
		healthInsurance.setClientId(clientId);
		
		healthdao.saveMyHealthInfo(healthInsurance);
		
		//logs message
		logger.info("Records save in Database Successfully");
	
		return "healthInsurance";
		
	}

}
