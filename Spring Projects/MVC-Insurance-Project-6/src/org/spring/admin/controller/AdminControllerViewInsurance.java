package org.spring.admin.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.spring.admin.repositries.InsuranceviewByAdminDao;
import org.spring.agent.beanofAgent.VehicleInsuranceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Deendayal
 * @version 1.1.2
 * @since 2017
 * The Class AdminControllerViewInsurance.
 */
@Controller
public class AdminControllerViewInsurance {
	
	@Autowired
	InsuranceviewByAdminDao daoinsurance;
	public static final Logger logger = Logger.getLogger(AdminControllerViewInsurance.class);
	
	/**
	 *  adminViewAllofInsurance() is method name of controller
	 *  VehicleInsuranceBean class of vehicle insurance 
	 *  Request Mapping when Agent register vehicle insurance viewAllcontentsofInsurance
	 *  viewAllcontentsofInsurance insurance  form action
	 *  Used model to show some message
	 *  Return type is String and return adminviewsAllinsurance.jsp page
	 */
	@RequestMapping(value="viewAllcontentsofInsurance")
	public String adminViewAllofInsurance(VehicleInsuranceBean vehicledata,Model model){
		
		//log message
		logger.info("Admin can view all of Insurance");
		List<VehicleInsuranceBean> adminInsurance = daoinsurance.InsurancesofAllclients();
		
		model.addAttribute("viewInsurance", adminInsurance);
		//log message
				logger.info("Method Successfully executing");
		return "adminviewsAllinsurance";
	}

	
}
