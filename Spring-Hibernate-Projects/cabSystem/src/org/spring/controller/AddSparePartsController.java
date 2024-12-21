package org.spring.controller;

import java.util.List;

import org.spring.dto.AddVehicleBeans;
import org.spring.dto.SparePartsBeans;
import org.spring.services.AddVehicleServices;
import org.spring.services.SparePartsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddSparePartsController {
	
	@Autowired
	SparePartsServices sparePartsService;
	
	@Autowired
	AddVehicleServices addVehicleServices;
	

	@RequestMapping(value="/sparePartsAdd")
	public String redirectPageToSpareParts(AddVehicleBeans addVehicleBeans,Model model){
		
		List<AddVehicleBeans> vehicleList = addVehicleServices.selectVehicleDetails(addVehicleBeans);
		System.out.println("Vehicle List is "+vehicleList);
		model.addAttribute("vehicleList", vehicleList);
		
		return "addSpareParts";
	}
	
	@RequestMapping(value="/saveDetailsOfspareParts")
	public String saveSparePartsData(SparePartsBeans sparePartsBeans){
		System.out.println("In spareparts controller");
		sparePartsService.addSpareParts(sparePartsBeans);
		
		return "welcome";
	}
	
	@RequestMapping(value="/sparePartsdetails")
	public String viewAllSpareData(SparePartsBeans sparePartsBeans,Model model){
		
		List<SparePartsBeans> spareList = sparePartsService.selectedSparesRecords(sparePartsBeans);
		System.out.println("spareList List is "+spareList);
		model.addAttribute("spareList", spareList);
		
		return "viewSpareDetails";
	}
}
