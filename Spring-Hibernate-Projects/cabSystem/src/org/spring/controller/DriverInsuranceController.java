package org.spring.controller;

import java.util.List;

import org.spring.dto.AddDriverBeans;
import org.spring.dto.DriverInsuranceBeans;
import org.spring.services.DriverInsuranceService;
import org.spring.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DriverInsuranceController {

	@Autowired
	DriverInsuranceService driverInsuranceService;
	
	@Autowired
	DriverService driverService;

	
	
	@RequestMapping("/driverInsuranceFormNextPage")
	public String driverInsurancePage( AddDriverBeans addDriverBeans,Model model){
		
		List<AddDriverBeans> driverList = driverService.selectDriverDetails(addDriverBeans);
		model.addAttribute("driverList", driverList);
		return "driverInsuranceForm";
	}
	
	@RequestMapping("/insuranceSaveForDriver")
	public String driverInsuranceSave(DriverInsuranceBeans driverInsuranceBeans){
		
		driverInsuranceService.saveDriverInsuranceContents(driverInsuranceBeans);
		
		return "welcome";
	}
	
	@RequestMapping("/viewInsurancesOfDriversDetails")
	public String detailsOfDrivers(DriverInsuranceBeans driverInsuranceBeans,Model model){
		
		List<DriverInsuranceBeans>  insuraceList  = driverInsuranceService.driverInsuaranceSelectedData(driverInsuranceBeans);
		model.addAttribute("insuraceList", insuraceList);
		return "viewDriverInsuranceDetails";
	}
	
	
	
	
}
