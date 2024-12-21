package org.spring.services;

import java.util.List;

import org.spring.dto.AddRouteBeans;
import org.spring.repositry.AddNewRouteDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class AddRouteServices {
	
	@Autowired
	AddNewRouteDaoImpl addnewRouteDaoimpl;
	
	public int saveRouteData(AddRouteBeans addRouteBeans){
		
		return addnewRouteDaoimpl.saveRouteData(addRouteBeans);
	}
	
	public List <AddRouteBeans> infoViewsRoutes(AddRouteBeans addRouteBeans){
		
		return addnewRouteDaoimpl.infoViewsRoutes(addRouteBeans);
	}
}
