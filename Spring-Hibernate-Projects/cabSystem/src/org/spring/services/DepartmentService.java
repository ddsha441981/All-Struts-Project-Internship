package org.spring.services;

import java.util.List;

import org.spring.dto.DepartmentBeans;
import org.spring.repositry.DepartmentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDaoImpl departmentDaoImpl;
	
	public int adddepartmentsData(DepartmentBeans departmentBeans){
		
		System.out.println("In Services");
		return departmentDaoImpl.adddepartmentsData(departmentBeans);
	}
	
	public List<DepartmentBeans> departmentAllData(DepartmentBeans departmentBeans){
		
		System.out.println("In Services");
		return departmentDaoImpl.departmentAllData(departmentBeans);
	}

}
