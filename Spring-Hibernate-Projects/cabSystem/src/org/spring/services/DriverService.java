package org.spring.services;

import java.util.List;

import org.spring.dto.AddDriverBeans;
import org.spring.repositry.DriverDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
	
	@Autowired
	DriverDaoImpl driverDaoImpl;
	
	
	public int saveDriversContents(AddDriverBeans addDriverBeans){
		
		return driverDaoImpl.saveDriversContents(addDriverBeans);
	}
	
	public List<AddDriverBeans> selectDriverDetails(AddDriverBeans addDriverBeans){
		
		return driverDaoImpl.selectDriverDetails(addDriverBeans);
	}
	
	public List<AddDriverBeans> selectedIdForDriver(AddDriverBeans addDriverBeans){
		
		return driverDaoImpl.selectedIdForDriver(addDriverBeans);
	}

}
