package org.spring.services;

import java.util.List;

import org.spring.dto.OilExpensesBeans;
import org.spring.repositry.OilExpensesDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OilExpensesService {

	@Autowired 
	OilExpensesDaoImpl oilExpensesDaoImpl;
	
	public int saveOil(OilExpensesBeans oilExpensesBeans){
		
		return oilExpensesDaoImpl.saveOil(oilExpensesBeans);
	}
	
	public List<OilExpensesBeans> viewsOILS(OilExpensesBeans oilExpensesBeans){
		
		return oilExpensesDaoImpl.viewsOILS(oilExpensesBeans);
	}
}
