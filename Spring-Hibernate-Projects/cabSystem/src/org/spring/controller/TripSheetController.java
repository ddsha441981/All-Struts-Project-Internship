package org.spring.controller;

import java.util.List;

import org.spring.dto.AddVehicleBeans;
import org.spring.dto.TripSheetBeans;
import org.spring.dto.VehicleAllocatedBeans;
import org.spring.services.AddVehicleServices;
import org.spring.services.TripSheetService;
import org.spring.services.VehicleAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TripSheetController {

	@Autowired
	TripSheetService tripSheetService;
	
	@Autowired
	AddVehicleServices addVehicleServices;
	
	@Autowired
	VehicleAllocationService vehicleAllocationService;
	
	
	@RequestMapping(value="/addTripSheet")
	public String tripSheetsNextPageRedirect(AddVehicleBeans addVehicleBeans,VehicleAllocatedBeans vehicleAllocatedBeans,Model model){
		
		List<AddVehicleBeans> vehicleList = addVehicleServices.selectVehicleDetails(addVehicleBeans);
		List<VehicleAllocatedBeans> vehicleAllocatedList = vehicleAllocationService.viewsAllocatedDetails(vehicleAllocatedBeans);
		
		System.out.println("fgcbcbcbdb"+vehicleAllocatedList.toString());
		
		model.addAttribute("vehicleList", vehicleList);
		model.addAttribute("vehicleAllocatedList", vehicleAllocatedList);
		
		
		return "tripSheet";
	}
	
	@RequestMapping(value="/storeTripSheet")
	public String saveTrips(TripSheetBeans tripSheetBeans){
		tripSheetService.saveTripSheet(tripSheetBeans);
		return "welcome";
	}
	
	@RequestMapping(value="/viewTripSheetDetails")
	public String viewstripsDetails(TripSheetBeans tripSheetBeans,Model model){
		List<TripSheetBeans> tripList  = tripSheetService.listOfTrip(tripSheetBeans);
		model.addAttribute("tripList", tripList);
		return "viewTripsheetDetails";
	}
}
