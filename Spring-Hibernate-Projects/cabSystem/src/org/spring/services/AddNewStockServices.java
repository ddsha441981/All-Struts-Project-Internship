package org.spring.services;

import java.util.List;

import org.spring.dto.AddNewStockBeans;
import org.spring.repositry.AddNewStockDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddNewStockServices {

	@Autowired
	AddNewStockDaoImpl addNewStockDaoImpl;
	
	public int saveStocks(AddNewStockBeans addNewStockBeans){
		
		return addNewStockDaoImpl.saveStocks(addNewStockBeans);
	}
	
	public List<AddNewStockBeans> viewStockFetch(AddNewStockBeans addNewStockBeans){
		
		return addNewStockDaoImpl.viewStockFetch(addNewStockBeans);
	}
}

