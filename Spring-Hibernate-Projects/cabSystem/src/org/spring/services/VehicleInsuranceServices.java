package org.spring.services;

import java.util.List;

import org.spring.dto.VehicleInsuranceBeans;
import org.spring.repositry.VehicleInsuranceDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class VehicleInsuranceServices {

	@Autowired 
	VehicleInsuranceDaoImpl vehicleInsuranceDaoImpl;
	
	
	public int savevehicleInsurance(VehicleInsuranceBeans vehicleInsuranceBeans){
		
		return vehicleInsuranceDaoImpl.savevehicleInsurance(vehicleInsuranceBeans);	
	}
	
	public List<VehicleInsuranceBeans> vehiclesDataOfInsurances(VehicleInsuranceBeans vehicleInsuranceBeans){
		
		return vehicleInsuranceDaoImpl.vehiclesDataOfInsurances(vehicleInsuranceBeans);
	}
		
		
}
