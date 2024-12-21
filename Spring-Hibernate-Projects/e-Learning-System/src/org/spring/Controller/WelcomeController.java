package org.spring.Controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/***
 * @author : Deendayal
 * 
 * @param : model to set object of Welcome page Controller class
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 29-2017
 */

@Controller
public class WelcomeController {

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
	 * Handle request to the default page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewHome() {
		
		return "home";
	}
	
	/**
	 * Handle request to the Forgot Password page
	 * login() Method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@RequestMapping(value = "/LoginPage", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	
	/*@RequestMapping(value ="/pmPage")
	public String pm(){
		
		System.out.println("Page Redirect Project Manager");
		return "pmHome";
	}
	
	@RequestMapping(value ="/trainerPage")
	public String trainer(){
		
		System.out.println("Page Redirect Trainer");
		return "trainerHome";
	}
	
	@RequestMapping(value ="/studentPage")
	public String student(){
		
		System.out.println("Page Redirect Student");
		return "studentHome";
	}*/
	
	
}
