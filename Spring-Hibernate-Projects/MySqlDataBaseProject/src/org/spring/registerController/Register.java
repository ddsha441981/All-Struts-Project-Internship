package org.spring.registerController;

import org.spring.registerBeans.RegisterBeans;
import org.spring.registerDao.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {

	@Autowired(required = true)
	RegisterDao dao;
	
	@RequestMapping(value="/pageRedirect")
	public String userValidate(RegisterBeans registerBeans,Model model){
		
		System.out.println("In Register Controller");
		
		model.addAttribute("registerBeans", new RegisterBeans());
		return "loginPage";
	}
	
	
	@RequestMapping(value="/nextPageRedirectHTML")
	public String userFormSubmiting(@ModelAttribute("registerBeans")RegisterBeans registerBeans,Model model,BindingResult result){
		
		System.out.println("In Register Controller");
		dao.registerContents(registerBeans);
		model.addAttribute("registerBeans", new RegisterBeans());
		return "welcome";
	}
	
	
}
