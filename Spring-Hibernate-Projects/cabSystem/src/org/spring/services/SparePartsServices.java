package org.spring.services;

import java.util.List;

import org.spring.dto.SparePartsBeans;
import org.spring.repositry.SparePartsDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SparePartsServices {

	@Autowired
	SparePartsDaoImpl sparePartsDaoImpl;

	public int addSpareParts(SparePartsBeans sparePartsBeans){
		
		return sparePartsDaoImpl.addSpareParts(sparePartsBeans);
	}
	
	public List<SparePartsBeans> selectedSparesRecords(SparePartsBeans sparePartsBeans){
		
		return sparePartsDaoImpl.selectedSparesRecords(sparePartsBeans);
	}
}
