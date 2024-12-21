package org.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.dto.AddEmployeeBeans;
import org.spring.dto.AdminLoginBeans;
import org.spring.dto.ManagerBeans;
import org.spring.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	final public static Logger logger =Logger.getLogger(LoginController.class);
	
	@Autowired
	LoginServices loginservice;
	
	@RequestMapping(value = "/loginPage")
	public String loginModule(AdminLoginBeans adminLoginBeans){
		
		//System.out.println("Login Page Controller ");
		logger.info("Login Controller Executed");
		return "loginPage";
	}
	
	@RequestMapping(value = "/selectedLoginUsingRoleId")
	public String loginUsingRole(AdminLoginBeans adminLoginBeans,AddEmployeeBeans addEmployeeBeans,ManagerBeans managerBeans,Model model,BindingResult result,HttpServletRequest request){
		
		logger.info("Main Login Method Executed");
		//System.out.println("Login main Page Controller ");
		if(adminLoginBeans.getRole().equalsIgnoreCase("admin")){
			
			//System.out.println("Admin");
			logger.info("Admin Role Selected");
			int status = loginservice.adminLogin(adminLoginBeans);
			//System.out.println("Admin Id is "+status);
			logger.info("Admin Login Successfully done");
			return "adminProfile";
		}
		else if(adminLoginBeans.getRole().equalsIgnoreCase("employee")){
			int count1 =  loginservice.employeeLogin(addEmployeeBeans);
			//System.out.println("Employee id "+count1);
			
			logger.info("Employee Login Successfully done");
			
			return "employeeProfile";
		}
		
		else if(adminLoginBeans.getRole().equalsIgnoreCase("maintainmanager")){
			
			logger.info("maintainmanager Role Selected");
			
			int count2 =  loginservice.managerLogin(managerBeans);
			if(count2>0){
				request.getSession().setAttribute("mId", count2);
				logger.info("maintainmanager Login Successfully done");
				
				return "maintainProfile";
			}
			else{
				
			}
			logger.info("maintainmanager Login Failed ");
			//System.out.println("Maintance id "+count2);
			return "Error";
			
		}
		
		else if(adminLoginBeans.getRole().equalsIgnoreCase("hrmanager")){
			//System.out.println("HR login Page");
			logger.info("hrmanager Role Selected");
			int count3 =  loginservice.managerLogin(managerBeans);
			if(count3>0){
			//manager id set in session
			request.getSession().setAttribute("mId", count3);
			logger.info("hrmanager Login Successfully done");
			//System.out.println("hrProfile id "+count3);
			
			return "hrProfile";
			}
			else{
				logger.info("hrProfile Login Failed ");
				return "Error";
			}
		}
		
		else if(adminLoginBeans.getRole().equalsIgnoreCase("movementmanager")){
			logger.info("movementmanager Role Selected");
			int count4 =  loginservice.managerLogin(managerBeans);
			if(count4>0){
				
				//manager id set in session
				request.getSession().setAttribute("mId", count4);
				//System.out.println("Employee id "+count4);
				logger.info("movementmanager Login Successfully done");
				
				return "movementProfile";
			}
			else{
				logger.info("movementmanager Login Failed ");
				return "Error";
			}
			
		}
		
		else if(adminLoginBeans.getRole().equalsIgnoreCase("insurancemanager")){
			
			logger.info("insurancemanager Role Selected");
			int count5 =  loginservice.managerLogin(managerBeans);
			if(count5>0){
				
				request.getSession().getAttribute("mId");
				//System.out.println("insuranceProfile id "+count5);
				logger.info("insurancemanager Login Successfully done");
				
				return "insuranceManagerProfile";
			}
			else{
				logger.info("insurancemanager Login Failed ");
				return "Error";
			}
			
		}
		
		else if(adminLoginBeans.getRole().equalsIgnoreCase("assurencemanager")){
			
			logger.info("assurencemanager Role Selected");
			
			int count6 =  loginservice.managerLogin(managerBeans);
			//System.out.println("assurenceProfile id "+count6);
			logger.info("assurencemanager Login Successfully done");
			
			return "qualityAssuranceProfile";
		}
		
		else if(adminLoginBeans.getRole().equalsIgnoreCase("financemanager")){
			
			int count7 =  loginservice.managerLogin(managerBeans);
			System.out.println("financeProfile id "+count7);
			
			return "financeProfile";
		}
		
		else{
			
			logger.info("Login Failed ");
			return "Error";
		}
		
		
		
	}

}
