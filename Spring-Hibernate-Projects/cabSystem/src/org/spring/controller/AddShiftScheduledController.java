package org.spring.controller;

import java.sql.SQLException;
import java.util.List;

import org.spring.dto.AddEmployeeBeans;
import org.spring.dto.AddRouteBeans;
import org.spring.dto.ShiftScheduledBeans;
import org.spring.services.AddEmployeeServices;
import org.spring.services.AddRouteServices;
import org.spring.services.ShiftScheduledServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddShiftScheduledController {

	@Autowired
	
	ShiftScheduledServices shiftScheduledServices;
	
	@Autowired
	AddRouteServices addRouteService;
	

	@Autowired
	AddEmployeeServices addAdminServices;
	
	
	
	@RequestMapping(value="/addShiftScheduledPage")
	public String shiftRedirectpageNext(AddRouteBeans addRouteBeans,AddEmployeeBeans addEmployeeBeans,Model model) throws SQLException{
		
		List<AddRouteBeans> routeList = addRouteService.infoViewsRoutes(addRouteBeans);
		model.addAttribute("routeList", routeList);
		
		List<AddEmployeeBeans> empList = addAdminServices.viewsEmployees(addEmployeeBeans);
		model.addAttribute("empList", empList);
		
		return "addShiftScheduled";
	}
	
	@RequestMapping(value="/addShiftSchedule")
	public String saveShiftscheduled(ShiftScheduledBeans shiftScheduledBeans){
		shiftScheduledServices.saveShiftDetails(shiftScheduledBeans);
		
		return "welcome";
	}
	

	@RequestMapping(value="/detailsAShiftScheduled")
	public String viewDetailsShiftScheduled(ShiftScheduledBeans shiftScheduledBeans,Model model) {
		
		List<ShiftScheduledBeans> shiftList = shiftScheduledServices.infoShiftsDetails(shiftScheduledBeans);
		model.addAttribute("shiftList", shiftList);
			
		return "viewShiftDetails";
	}
}
