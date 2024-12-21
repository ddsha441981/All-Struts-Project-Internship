package org.spring.controller;

import java.util.List;

import org.spring.dto.DepartmentBeans;
import org.spring.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value = "/addDepartMentsRedirctPage")
	
	public String departmentaddGotoPage(){
		
		return "departments";
		
	}
	
	@RequestMapping(value ="/addDepartments")
	public String adddepartments(DepartmentBeans departmentBeans){
		
		
		departmentService.adddepartmentsData(departmentBeans);
		System.out.println("Department added");
		return "departments";
		
	}
	
	@RequestMapping(value ="/selectedManagerContents")
	public String fetchManagers(DepartmentBeans departmentBeans,Model model){
		
		
		List<DepartmentBeans> departList = departmentService.departmentAllData(departmentBeans);
		System.out.println("Department Records fetch" +departList);
		model.addAttribute("list", departList);
		return "departmentDetails";
		
	}

	
}
