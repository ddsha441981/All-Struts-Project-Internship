package org.spring.mvc.controller;

import java.util.List;

import org.spring.mvc.beanexample.Policiesdetails;
import org.spring.mvc.repositories.Daoofpolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@Autowired
	Daoofpolicy dao;

	@RequestMapping("/welcome")
	public String welcome(Model model, Model model2) {
		model.addAttribute("msg", "Welcome Admin");
		List list = dao.getpolicyrecords();
		model2.addAttribute("policyinfo", list);
		System.out.println("This is Welcome Method");
		return "home";
	}

	@RequestMapping("/aboutpolicies")
	public String aboutpolicy(Policiesdetails policy, Model model) {
		System.out.println("Hello this is about policy Methods");
		// dao.createtable();
		 dao.savepolicies(policy);
		model.addAttribute("msg1", "Data Inserted Successfully");

		return "home";
	}
	
	@RequestMapping("/editpolicy")
	public String editpolicyofdetails(Policiesdetails policy){
		
		System.out.println(policy.getPolicyid());
		System.out.println("This is Edit Action");
		return "home";
	}

}
