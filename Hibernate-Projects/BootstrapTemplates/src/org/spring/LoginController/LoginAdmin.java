package org.spring.LoginController;

import javax.servlet.http.HttpServletRequest;

import org.spring.Bean.LoginBeans;
import org.spring.repositaries.LoginReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginAdmin {
	
	@Autowired(required = true)
	LoginReposi myservice;
	
	//logger
	org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LoginAdmin.class);
	
	
	@RequestMapping(value="/redirectHomeToLogin",method = RequestMethod.GET)
	
	public String redirectForLogin(){
		
		logger.info("Request SuccessFully Mapped of Admin");
		
		return "login";
	}

	
@RequestMapping(value="/loginForAdmin",method = RequestMethod.GET)
	
	public String loginadmin(LoginBeans logins,HttpServletRequest request,Model model){
		
	if(logins.getRoleName().equalsIgnoreCase("Admin") || logins.getRoleName().equalsIgnoreCase("Line Manager") || logins.getRoleName().equalsIgnoreCase("Employee")){
		
		int val = myservice.vaildLoginUser(logins);//calling service Methods
		
		if(val > 0){
			
			request.getSession().setAttribute("roleId", val);;
		
			logger.info("!!!!!!!!!!!!!!Vaild User!!!!!!!!!!!!"+val);
			
			
			return "index";
		}
		
		else{
			
			System.out.println("Wrong Input");
			return "errors_404";
		}
	}
	else{
		
		
		logger.info("..............You'r Not Vaild User.........");
		
		return "errors_404";
	}
		
		
	}
}
