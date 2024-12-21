package org.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.spring.dto.AddVehicleBeans;
import org.spring.dto.VendorBeans;
import org.spring.services.AddVehicleServices;
import org.spring.services.VendorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleController {

	@Autowired
	AddVehicleServices addVehicleServices;
	
	@Autowired
	VendorServices vendorServices;
	
	
	@RequestMapping(value="/addVehicles")
	public String vehiclesRedirectNextPage(VendorBeans vendorBeans,Model model){
		
		List<VendorBeans> vendorList = vendorServices.vendorDetailsSelected(vendorBeans);
		
		model.addAttribute("vendorList", vendorList);
		
		return "addVehicle";
	}
	
	@RequestMapping(value="/addVehiclesDetails")
	public String saveVehicleDetails(AddVehicleBeans addVehicleBeans ,Model model,HttpServletRequest request){
		
		int mId = (int) request.getSession().getAttribute("mId");
		addVehicleBeans.setmId(mId);
		System.out.println("Here manager id "+mId);
		int status = addVehicleServices.saveVehicle(addVehicleBeans);
		return "welcome";
	}
	
	
	@RequestMapping(value="/vehicleDeatilsViews")
	public String selectVehicleDetails(AddVehicleBeans addVehicleBeans,Model model){
		
		List<AddVehicleBeans> vehicleList = addVehicleServices.selectVehicleDetails(addVehicleBeans);
		
		model.addAttribute("vehicleList", vehicleList);
		
		return "viewVehicleDetails";
	}
}
