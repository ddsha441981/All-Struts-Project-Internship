package org.spring.services;

import java.util.List;

import org.spring.dto.ShiftScheduledBeans;
import org.spring.repositry.ShiftScheduledDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiftScheduledServices {
	

	@Autowired
	ShiftScheduledDaoImpl shiftScheduledDaoImpl;
	
	public int saveShiftDetails(ShiftScheduledBeans shiftScheduledBeans){
		
		return shiftScheduledDaoImpl.saveShiftDetails(shiftScheduledBeans);
	}
	
	public List<ShiftScheduledBeans> infoShiftsDetails(ShiftScheduledBeans shiftScheduledBeans){
		
		return shiftScheduledDaoImpl.infoShiftsDetails(shiftScheduledBeans);
	}
}
