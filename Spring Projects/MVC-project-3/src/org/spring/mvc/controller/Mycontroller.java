package org.spring.mvc.controller;
/**@author Deendayal*/

import java.util.List;

import org.spring.mvc.beanclasses.Login;
import org.spring.mvc.beanclasses.Register;
import org.spring.mvc.repositories.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {

	@Autowired
	LoginDAO dao;

	@RequestMapping(value = "/loginpage")
	public String savedataoflogin(Login login) {

		System.out.println("I am in Login Method");
		//dao.cratetable();
		//dao.save(login);

		return "welcome";
	}
	
	@RequestMapping(value = "/registermydata")
	public String registerdata(Register regi) {

		System.out.println("I am in Register Method");
		//dao.cratetable();
		dao.save(regi);

		return "welcome";
	}
	
	@RequestMapping(value = "/changepassword")
	public String changepwd(Register regi) {

		System.out.println("I am in Change password Method");
		
		//dao.change(regi);

		return "welcome";
	}
	
	@RequestMapping(value ="/getall")
	
	
	public String getalluser(Model model){
		List<Register> list=dao.getallrecords();
		
		System.out.println("List Of Data"+list);
		model.addAttribute("userinfo", list);
		
		 return "welcome";  
		
	}
}