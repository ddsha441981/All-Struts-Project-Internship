package org.spring.LoginController;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.EmployeeBeans.CustomersBeans;
import org.spring.LoginBeans.LoginsBeans;
import org.spring.LoginDaoImpl.LoginRepositry;
import org.spring.LoginServices.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	public static Logger logger = Logger.getLogger("LoginController.class");
	
	@Autowired(required = true)
	LoginService loginservice;
	
	@RequestMapping(value = "/jumpToAnotherPage",method = RequestMethod.GET)
	public String loginContents(){
		logger.info("Login Page SuccessFully Open");
		
		return "loginValid";
	}
	

	@RequestMapping(value = "/roleLogin",method = RequestMethod.GET)
	public String userRoleLoginPageredirect(LoginsBeans loginbeans,HttpServletRequest request,Model model,CustomersBeans custbens){
		logger.info("Login Request Map SuccessFully");
		if(loginbeans.getUserRole().equalsIgnoreCase("Admin") || loginbeans.getUserRole().equalsIgnoreCase("Employee") || loginbeans.getUserRole().equalsIgnoreCase("Customers") )
		{
			logger.info("You're Selected Correct UserRole is  ::  " +loginbeans.getUserRole());
			//logger.info("You're Selected Correct UserRole is  ::  " +custbens.getUserRole());
			
			if(loginbeans.getUserRole().equalsIgnoreCase("Admin"))
			{
				logger.info("Admin UserRole is Processing");
				
				int val1 = loginservice.loginForAdmin(loginbeans);	
				System.out.println("Admin Id is In controller" +val1);
				if(val1>0)
				{
					request.getSession().setAttribute("adminId", val1);
					model.addAttribute("msg", "Admin Login SuccessFully");
					logger.info("Admin Login SuccessFully ");
					return "adminProfile";
				}
				else
				{
					logger.info("Admin Login faild");
					return "Error";
				}
				
			}
			
			else if(loginbeans.getUserRole().equalsIgnoreCase("Employee"))
			{
				logger.info("Employee UserRole is Processing");
				
				int val2 = loginservice.loginForEmployee(loginbeans);
				if(val2>0)
				{
					request.getSession().setAttribute("empId", val2);
					model.addAttribute("msg", "Employee Login SuccessFully");
					
					logger.info("Employee Login SuccessFully ");
					return "employeeProfile";
				}
				else
				{
					logger.info("Employee Login faild");
					return "Error";
				}
				
			}
			
			else if(loginbeans.getUserRole().equalsIgnoreCase("Customers"))
			{
				logger.info("Customer UserRole is Processing");
				
				int val3 = loginservice.loginForCustomers(loginbeans);	
				if(val3>0)
				{
					request.getSession().setAttribute("customId", val3);
					model.addAttribute("msg", "Customer Login SuccessFully");
					
					logger.info("Customer Login SuccessFully ");
					return "customerProfile";
				}
				else
				{
					logger.info("Customer Login faild");
					return "Error";
				}
				
			}
			
			return "welcome";
			
		}
		else
		{
			logger.info("You're Selected Incorrect UserRole is :: " + loginbeans.getUserRole());
			return "error";
		}
		
		
		
	}
	
	@RequestMapping(value = "/forgotPasswordCheckedMail",method = RequestMethod.GET)
	public String forgotpwd(LoginsBeans loginbeans,Model model){
		System.out.println("In forgot Password");
		if(loginbeans.getEmail()!=null)
		{
			int recordfound = loginservice.forgotpwdForAdmin(loginbeans);
			System.out.println("In Admin Profile"+recordfound);
			
			LoginsBeans adminpass = loginservice.gotpwd(recordfound);
			
			System.out.println("Now Admin Password is////"+adminpass);
			model.addAttribute("adminsPassword",adminpass);
			return "adminProfile";
		}
		else if(loginbeans.getEmail()!=null)
		{
			System.out.println("In Employee Profile");
			return "employeeProfile";
		}
		else if(loginbeans.getEmail()!=null)
		{
			System.out.println("In Customer Profile");
			return "customerProfile";
		}
		else
		{
			return "error";
		}
		
		
	}
}
