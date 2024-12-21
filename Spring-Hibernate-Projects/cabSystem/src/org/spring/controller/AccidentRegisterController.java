package org.spring.controller;

import java.util.List;

import org.spring.dto.AccidentDetailsBeans;
import org.spring.dto.AddDriverBeans;
import org.spring.dto.AddVehicleBeans;
import org.spring.dto.DriverInsuranceBeans;
import org.spring.dto.VehicleInsuranceBeans;
import org.spring.services.AccidentRegisterServices;
import org.spring.services.AddVehicleServices;
import org.spring.services.DriverInsuranceService;
import org.spring.services.DriverService;
import org.spring.services.VehicleInsuranceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccidentRegisterController {

	@Autowired
	AccidentRegisterServices accidentRegisterServices;
	
	@Autowired
	AddVehicleServices addVehicleServices;
	
	@Autowired
	DriverService driverService;

	@Autowired 
	VehicleInsuranceServices vehicleInsuranceServices;
	
	
	@Autowired
	DriverInsuranceService driverInsuranceService;
	
	
	@RequestMapping(value="/addNewAccidentDetails")
	public String accidentPageNextPageRedirect(AddVehicleBeans addVehicleBeans,AddDriverBeans addDriverBeans,DriverInsuranceBeans driverInsuranceBeans,VehicleInsuranceBeans vehicleInsuranceBeans,Model model){
		
		List<AddVehicleBeans> vehicleNoList = addVehicleServices.selectVehicleDetails(addVehicleBeans);
		List<AddDriverBeans> driverList = driverService.selectDriverDetails(addDriverBeans);
		List<DriverInsuranceBeans> driverInsuranceList = driverInsuranceService.driverInsuaranceSelectedData(driverInsuranceBeans);
		List<VehicleInsuranceBeans> vehicleInsuranceList = vehicleInsuranceServices.vehiclesDataOfInsurances(vehicleInsuranceBeans);
		
		model.addAttribute("vehicleNoList", vehicleNoList);
		model.addAttribute("driverList", driverList);
		model.addAttribute("driverInsuranceList", driverInsuranceList);
		model.addAttribute("vehicleInsuranceList", vehicleInsuranceList);
	
		return "addAccidentRegisterForm";
	}
	
	@RequestMapping(value="/saveAccidentdetails")
	public String saveAccidentData(AccidentDetailsBeans accidentDetailsBeans){
		
		accidentRegisterServices.saveAccidentData(accidentDetailsBeans);
		
		return "welcome";
	}
	
	@RequestMapping(value="/viewDetailsOfAccidentData")
	public String accidentPageNextPageRedirect(AccidentDetailsBeans accidentDetailsBeans,Model model){
		
		List <AccidentDetailsBeans> accidentList  = accidentRegisterServices.selectAccidentData(accidentDetailsBeans);
		model.addAttribute("accidentList", accidentList);
		return "viewAccidentDetails";
	}
	
	@RequestMapping(value="/feedbackActionTakenByAssuredMangerForAccident/{accidentId}")
	public String actionTaken(@PathVariable Integer accidentId ,AccidentDetailsBeans accidentDetailsBeans ,Model model){
		
		accidentDetailsBeans.setAccidentId(accidentId);
		
		List <AccidentDetailsBeans> usingId  = accidentRegisterServices.usingByIdDataSelected(accidentId);
		
		model.addAttribute("usingId", usingId);
		return "accidentActionTaken";
	}
	
	@RequestMapping(value="/takeActionByQualityManger")
	public String takeSaveActions(AccidentDetailsBeans accidentDetailsBeans){
		
		accidentRegisterServices.dataUpdate(accidentDetailsBeans);
		
		return "welcome";
	}
}
