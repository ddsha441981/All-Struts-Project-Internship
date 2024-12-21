package org.spring.controller;

import java.util.List;

import org.spring.dto.DepartmentBeans;
import org.spring.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value="/addManagers")
	public String gotoManagerRegisterPage(DepartmentBeans departmentBeans ,Model model){
		
		System.out.println("Manager Register Page");
		
		List<DepartmentBeans> list  = departmentService.departmentAllData(departmentBeans);
		model.addAttribute("dptlist", list);
		return "addManagersRegister";
	}

}
