package org.spring.controller;

import java.util.List;

import org.spring.dto.AddVehicleBeans;
import org.spring.dto.VehicleInsuranceBeans;
import org.spring.services.AddVehicleServices;
import org.spring.services.VehicleInsuranceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleInsuranceController {

	@Autowired
	AddVehicleServices addVehicleServices;
	
	@Autowired 
	VehicleInsuranceServices vehicleInsuranceServices;
	
	@RequestMapping(value="/vehicleInsuranceAddNextPage")
	public String vehicleInsuraceRedirectMainPage(AddVehicleBeans addVehicleBeans,Model model){
		
		List<AddVehicleBeans> vehicleList = addVehicleServices.selectVehicleDetails(addVehicleBeans);
		model.addAttribute("vehicleList", vehicleList);
		return "vehicleInsuranceRegister";
	}
	
	@RequestMapping(value="/dataofVehicleInsuranceSave")
	public String saveVehicleInsuranceData(VehicleInsuranceBeans vehicleInsuranceBeans){
		
		vehicleInsuranceServices.savevehicleInsurance(vehicleInsuranceBeans);
		return "welcome";
	}
	
	@RequestMapping(value="/vehicleInsuranceViewDetails")
	public String detailsInsurancesOfVehicles(VehicleInsuranceBeans vehicleInsuranceBeans,Model model){
		
		List<VehicleInsuranceBeans> vehicleInsuranceList = vehicleInsuranceServices.vehiclesDataOfInsurances(vehicleInsuranceBeans);
		model.addAttribute("vehicleInsuranceList", vehicleInsuranceList);
		
		return "viewInsuranceVehiclesDetails";
	}
}
