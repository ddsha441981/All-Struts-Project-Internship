package org.spring.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.spring.Service.LoginService;
import org.spring.Service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/***
 * @author : Deendayal
 * 
 * @param : model to set object of Login class
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 29-2017
 */

@Controller
public class LoginController {

	@Autowired(required = true)
	private LoginService loginService;
	
	/**
	 * Logger file
	 * @return properties  file
	 * @since  :June 29-2017
	 */
	 
	
	final static Logger msglogger = Logger.getLogger(LoginController.class);
	String logMsg = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\msgLog4J.properties";
	
	final static Logger errorlogger = Logger.getLogger(LoginController.class);
	String logError = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\errorLog4J.properties";
	
	final static Logger debuglogger = Logger.getLogger(LoginController.class);
	String logDebug = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\debugLog4J.properties";
	
	/**
	 * Handle request to the Login and check eamilId existing or not
	 * If existing in database then then login user
	 * loginPageRedirect() method
	 * AdminselectRecords()
	 * @return jsp page
	 * @since  :June 29-2017
	 */
	
	@RequestMapping(value="/loginUsingRoleId",method=RequestMethod.POST)
	public String loginPageRedirect(AdminBeans adminBeans,TrainerBeans trainerBeans,StudentBeans studentBeans,HttpServletRequest request,Model model){
		
		// Here Debugging Starts
		PropertyConfigurator.configure(logDebug);
		if(debuglogger.isDebugEnabled())
			
			debuglogger.debug(getClass());
		
		
		
		PropertyConfigurator.configure(logMsg);
		msglogger.info("Login Request Mapping Successfully");
		
		if(adminBeans.getRole().equalsIgnoreCase("Admin")){
			
			int count = loginService.AdminselectRecords(adminBeans);
			
			if(count>0){
			request.getSession().setAttribute("adminId", count);
			model.addAttribute("loginmsg","Login Successfully done");
			return "adminHome";
			}
			else{
				
				return "Error";
			}
		}
		
		/**
		 * Handle request to the Login and check eamilId existing or not
		 * If existing in database then then login user
		 * loginPageRedirect() method
		 * TrainerselectRecords() method
		 * @return jsp page
		 * @since  :June 29-2017
		 */
		else if(trainerBeans.getRole().equalsIgnoreCase("Trainer")){
			
			int count1 = loginService.TrainerselectRecords(trainerBeans);
			if(count1>0){
				
				request.getSession().setAttribute("adminId", count1);
				return "trainerHome";
			}
			else{
				return "Error";
			}
			
		}
		
		/**
		 * Handle request to the Login and check eamilId existing or not
		 * If existing in database then then login user
		 * loginPageRedirect() method
		 * StudentselectRecords()method
		 * @return jsp page
		 * @since  :June 29-2017
		 */
		else if(studentBeans.getRole().equalsIgnoreCase("Student")){
			
			int count3 = loginService.StudentselectRecords(studentBeans);
			System.out.println( count3 + "Here Count value is " );
			if(count3>0){
				
				return "studentHome";
			}
			else{
				return "Error";
			}
			
		}
		
		else{
			
			return "404";
		}
		
	}
	
	
	
	
}
