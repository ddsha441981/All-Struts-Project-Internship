package org.spring.controller;

import java.util.List;

import org.spring.dto.AddDriverBeans;
import org.spring.dto.AddVehicleBeans;
import org.spring.dto.OilExpensesBeans;
import org.spring.services.AddEmployeeServices;
import org.spring.services.AddVehicleServices;
import org.spring.services.DriverService;
import org.spring.services.OilExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OilExpensesController {

	@Autowired
	OilExpensesService oilExpensesService;
	
	@Autowired
	AddVehicleServices addVehicleServices;
	
	@Autowired
	DriverService driverService;

	
	@RequestMapping(value="/addOilExpensesNextPage")
	public String oil(AddDriverBeans addDriverBeans,AddVehicleBeans addVehicleBeans,Model model){
		
		List<AddDriverBeans> driverList = driverService.selectedIdForDriver(addDriverBeans);
		List<AddVehicleBeans> vehicleList = addVehicleServices.selectVehicleDetails(addVehicleBeans);
		
		model.addAttribute("driverList", driverList);
		model.addAttribute("vehicleList", vehicleList);
		return "addOilExpenses";
	}
	
	@RequestMapping(value="/storeDataForOilExpenses")
	public String saveOilExpenses(OilExpensesBeans oilExpensesBeans){
		
		oilExpensesService.saveOil(oilExpensesBeans);
		
		return "welcome";
	}
	
	@RequestMapping(value="/viewOilExpensesDetailsData")
	public String viewDetailsOfOil(OilExpensesBeans oilExpensesBeans,Model model){
		
		List<OilExpensesBeans> oilList = oilExpensesService.viewsOILS(oilExpensesBeans);
		model.addAttribute("oilList", oilList);
		return "viewOilDetails";
	}
}
