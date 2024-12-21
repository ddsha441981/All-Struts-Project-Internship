package org.spring.controller;

import java.sql.SQLException;
import java.util.List;

import org.spring.dto.AddDriverBeans;
import org.spring.dto.AddEmployeeBeans;
import org.spring.dto.AddRouteBeans;
import org.spring.dto.AddVehicleBeans;
import org.spring.dto.VehicleAllocatedBeans;
import org.spring.services.AddEmployeeServices;
import org.spring.services.AddRouteServices;
import org.spring.services.AddVehicleServices;
import org.spring.services.DriverService;
import org.spring.services.VehicleAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleAllocatedController {

	@Autowired
	VehicleAllocationService vehicleAllocationService;
	
	@Autowired
	AddVehicleServices addVehicleServices;
	
	@Autowired
	AddEmployeeServices addAdminServices;
	
	@Autowired
	DriverService driverService;

	@Autowired
	AddRouteServices addRouteService;
	
	
	@RequestMapping(value="/vehicleAllocationByMovementManager")
	public String vehicleAllocatedGoToNaxtPage(AddDriverBeans addDriverBeans,AddEmployeeBeans addEmployeeBeans,AddRouteBeans addRouteBeans,AddVehicleBeans addVehicleBeans,Model model) throws SQLException{
		
		List<AddDriverBeans> driverList = driverService.selectedIdForDriver(addDriverBeans);
		List<AddVehicleBeans> vehicleList = addVehicleServices.selectVehicleDetails(addVehicleBeans);
		List<AddEmployeeBeans> empList =addAdminServices.viewsEmployees(addEmployeeBeans);
		List<AddRouteBeans> routeList = addRouteService.infoViewsRoutes(addRouteBeans);
		
		model.addAttribute("driverList", driverList);
		model.addAttribute("vehicleList", vehicleList);
		model.addAttribute("empList", empList);
		model.addAttribute("routeList", routeList);
		
		
		return "addVehicleAllocation";
	}
	
	@RequestMapping(value="/saveVehicleAllocationDetails")
	public String saveAllocatedDetails(VehicleAllocatedBeans vehicleAllocatedBeans){
		
		vehicleAllocationService.saveVehicleAllocationData(vehicleAllocatedBeans);
		return "welcome";
	}
	
	@RequestMapping(value="/viewsVehiclesAllocations")
	public String views(VehicleAllocatedBeans vehicleAllocatedBeans,Model model){
		
		List<VehicleAllocatedBeans> allocationList = vehicleAllocationService.viewsAllocatedDetails(vehicleAllocatedBeans);
		model.addAttribute("allocationList", allocationList);
		
		return "viewVehicleAllocationDetails";
	}
}
