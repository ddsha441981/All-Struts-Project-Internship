package org.spring.services;

import java.util.List;

import org.spring.dto.TripSheetBeans;
import org.spring.repositry.TripSheetDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripSheetService {

	@Autowired
	TripSheetDaoImpl tripSheetDaoImpl;
	
	public int saveTripSheet(TripSheetBeans tripSheetBeans){
		
		return tripSheetDaoImpl.saveTripSheet(tripSheetBeans);
	}
	
	public List<TripSheetBeans> listOfTrip(TripSheetBeans tripSheetBeans){
		
		return tripSheetDaoImpl.listOfTrip(tripSheetBeans);
	}
}
