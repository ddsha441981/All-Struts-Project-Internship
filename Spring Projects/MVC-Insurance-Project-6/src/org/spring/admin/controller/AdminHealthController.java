package org.spring.admin.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.spring.admin.repositries.AdminhealthDao;
import org.spring.agent.beanofAgent.HealthInsurnceBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author Deendayal
* @since
* @version 1.1.2
*/

/** This class is Controller class
*  some methods delcared
*  Used Logger
*  Class AdminHealthController
*/
@Controller
public class AdminHealthController {

	Logger logger = Logger.getLogger(AdminHealthController.class);
	@Autowired
	AdminhealthDao adminhealthdao;
	
	/**
	 * @RequestMapping(value="/displayhealthIndsurancesContentsByAdmin") Request Mapping
	 * displayAllHealthClient is method of Controller to further process
	 * HealthInsurnceBeans class of HealthInsurance
	 * */
	@RequestMapping(value="/displayhealthIndsurancesContentsByAdmin")
	public String displayAllHealthClient(Model model){
		//logs message
				logger.info("Form Request Successfully Mapping");
				
		List<HealthInsurnceBeans> Q1 = adminhealthdao.viewAllofhealthsclientsInsurnces();
		model.addAttribute("Healthlist", Q1);
		
		//logs message
				logger.info("Records Retrive Successfully From Database ");
		return "ViewHealthClients";
		
	}
}
