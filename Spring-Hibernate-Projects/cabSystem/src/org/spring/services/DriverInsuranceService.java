package org.spring.services;

import java.util.List;

import org.spring.dto.DriverInsuranceBeans;
import org.spring.repositry.DriverInsuranceDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverInsuranceService {
	
	@Autowired
	DriverInsuranceDaoImpl driverInsuranceDaoImpl;
	
	public int saveDriverInsuranceContents(DriverInsuranceBeans driverInsuranceBeans){
		
		return driverInsuranceDaoImpl.saveDriverInsuranceContents(driverInsuranceBeans);
	}
	
	public List<DriverInsuranceBeans> driverInsuaranceSelectedData(DriverInsuranceBeans driverInsuranceBeans){	 
		
		return driverInsuranceDaoImpl.driverInsuaranceSelectedData(driverInsuranceBeans);
	}

}
