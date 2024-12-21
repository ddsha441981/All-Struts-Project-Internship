package org.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.spring.BeansClass.ChangePasswordUserBeans;
import org.spring.repositry.ChangePasswordUserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChangePasswordUserController {
	
	@Autowired(required = true)
	ChangePasswordUserDaoImpl changePasswordUserDaoImpl;
	
	@RequestMapping(value ="/changeUserPassword")
	public String userChangePassword(ChangePasswordUserBeans changePasswordUserBeans){
		
		System.out.println("In User Change Password Controller");
		return "userchangePassword";
	}
	
	@RequestMapping(value ="/userPasswordChangeUsingLogin")
	public String passwordChangedByUserUsingId(@ModelAttribute("changePasswordUserBeans")ChangePasswordUserBeans changePasswordUserBeans,Model model,BindingResult result,HttpServletRequest request){
		
		System.out.println("In Controller Of User");
		int userId = (int) request.getSession().getAttribute("userId");
		changePasswordUserBeans.setUserId(userId);
		
		ChangePasswordUserBeans isExistedEmail = changePasswordUserDaoImpl.userchangingOwnPassword(changePasswordUserBeans);
		if(isExistedEmail ==null){
			
			model.addAttribute("isNotEmailExistsUser", "Your Email Not Existed in Account");
			return "error";
		}
		else{
			
			int status =  changePasswordUserDaoImpl.updatedUserChangePassword(changePasswordUserBeans);
			
			model.addAttribute("userChangePassworddone", "Your Password SuccessFully Done");
			
			model.addAttribute("changePasswordUserBeans", new ChangePasswordUserBeans());
			return "welcome";
		}
	
		
	}
	
}
