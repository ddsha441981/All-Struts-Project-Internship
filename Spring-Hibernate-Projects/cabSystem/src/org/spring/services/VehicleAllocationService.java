package org.spring.services;

import java.util.List;

import org.spring.dto.VehicleAllocatedBeans;
import org.spring.repositry.VehicleAllocationDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleAllocationService {

	@Autowired
	VehicleAllocationDaoImpl vehicleAllocationDaoImpl;
	
	
	public int saveVehicleAllocationData(VehicleAllocatedBeans vehicleAllocatedBeans){
		
		return vehicleAllocationDaoImpl.saveVehicleAllocationData(vehicleAllocatedBeans);
	}
	
	public List<VehicleAllocatedBeans> viewsAllocatedDetails(VehicleAllocatedBeans vehicleAllocatedBeans){
		
		return  vehicleAllocationDaoImpl.viewsAllocatedDetails(vehicleAllocatedBeans);
		
	}
	
}
