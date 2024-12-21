package org.spring.services;

import java.util.List;

import org.spring.dto.AddVehicleBeans;
import org.spring.repositry.AddVehicleDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddVehicleServices {

	@Autowired
	AddVehicleDaoImpl addVehicleDaoImpl;
	

	public int saveVehicle(AddVehicleBeans addVehicleBeans){
		
		return addVehicleDaoImpl.saveVehicle(addVehicleBeans);
		
	}
	
	public List<AddVehicleBeans> selectVehicleDetails(AddVehicleBeans addVehicleBeans){
		
		return addVehicleDaoImpl.selectVehicleDetails(addVehicleBeans);
		
	}
	
}
