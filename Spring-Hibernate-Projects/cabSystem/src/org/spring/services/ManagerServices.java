package org.spring.services;

import java.util.List;

import org.spring.dto.ManagerBeans;
import org.spring.repositry.ManagerDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServices {
	
	@Autowired
	ManagerDaoImpl managerDaoImpl;

	public int saveManager(ManagerBeans managerBeans){
		
		return managerDaoImpl.saveManager(managerBeans);
	}
	
	public List<ManagerBeans> viewManager(ManagerBeans managerBeans){
		System.out.println("in Manager Service select");
		return managerDaoImpl.viewManager(managerBeans);
	}
}
