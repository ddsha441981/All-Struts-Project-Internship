package org.spring.Controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * @author : Deendayal
 * 
 * @param : model to set object of Admin Controller class
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 29-2017
 */
@Controller
public class AdminController {

	/**
	 * Logger file
	 * @return properties  file
	 * @since  :June 30-2017
	 */
	final static Logger msglogger = Logger.getLogger(LoginController.class);
	String logMsg = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\msgLog4J.properties";
	
	final static Logger errorlogger = Logger.getLogger(LoginController.class);
	String logError = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\errorLog4J.properties";
	
	final static Logger debuglogger = Logger.getLogger(LoginController.class);
	String logDebug = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\debugLog4J.properties";
	
	
	/**
	 * Handle request to the AdminProfile
	 * admin() Method
	 * @return jsp page
	 * @since  :June 29-2017
	 */
	@RequestMapping(value ="/adminsProfile")
	public String admin(){
		
		System.out.println("Page Redirect Admin");
		return "adminProfile";
	}
}
