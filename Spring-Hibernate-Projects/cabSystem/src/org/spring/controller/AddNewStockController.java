package org.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.spring.dto.AddNewStockBeans;
import org.spring.services.AddNewStockServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddNewStockController {

	@Autowired
	
	AddNewStockServices addNewStockServices;
	
	@RequestMapping(value="/addNewStockPage")
	public String stockPageRedircts(AddNewStockBeans addNewStockBeans){
		
		return "addNewStock";
	}
	

	@RequestMapping(value="/saveDetailsOfStocks")
	public String saveNewStockDetails(AddNewStockBeans addNewStockBeans,HttpServletRequest request){
		
		int mId = (int) request.getSession().getAttribute("mId");
		addNewStockBeans.setmId(mId);
		addNewStockServices.saveStocks(addNewStockBeans);
		
		return "welcome";
	}
	
	@RequestMapping(value="/StockDetails")
	public String detailsofStocks(AddNewStockBeans addNewStockBeans,Model model){
		
		List<AddNewStockBeans> stockList = addNewStockServices.viewStockFetch(addNewStockBeans);
		
		model.addAttribute("stockList", stockList);
		return "viewStockDetails";
	}
	
	
}
