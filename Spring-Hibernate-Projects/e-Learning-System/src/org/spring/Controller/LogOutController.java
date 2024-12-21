package org.spring.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/***
 * @author : Deendayal
 * 
 * @param : model to set object of Login class
 * 
 * @return : String name of the Jsp page (LogOut Using Role)
 * 
 * @ since :July 14-2017
 */
@Controller
public class LogOutController {

	/**
	 * Logger file
	 * @return properties  file
	 * @since  :July 14-2017
	 */
	 
	
	final static Logger msglogger = Logger.getLogger(LoginController.class);
	String logMsg = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\msgLog4J.properties";
	
	final static Logger errorlogger = Logger.getLogger(LoginController.class);
	String logError = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\errorLog4J.properties";
	
	final static Logger debuglogger = Logger.getLogger(LoginController.class);
	String logDebug = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\debugLog4J.properties";
	
	/**
	 * Handle request to the LogOut of Admin
	 * logOutAdmin() method
	 * @return jsp page
	 * @since  :July 14-2017
	 */
	@RequestMapping(value="/logoutAdmin")
	public String logOutAdmin(HttpServletRequest  request){
		
		// Here Debugging Starts
				PropertyConfigurator.configure(logDebug);
				if(debuglogger.isDebugEnabled())
					
					debuglogger.debug(getClass());
				
				
				
				PropertyConfigurator.configure(logMsg);
				msglogger.info("Logout Request Mapping Successfully");
				
		
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();
		return "login";
	}
	
	/**
	 * Handle request to the LogOut of Admin
	 * logOutAdmin() method
	 * @return jsp page
	 * @since  :July 14-2017
	 */
	@RequestMapping(value="/logoutTrainer")
	public String logOutTrianer(HttpServletRequest  request){
		
		// Here Debugging Starts
				PropertyConfigurator.configure(logDebug);
				if(debuglogger.isDebugEnabled())
					
					debuglogger.debug(getClass());
				
				
				
				PropertyConfigurator.configure(logMsg);
				msglogger.info("Logout Request Mapping Successfully");
				
		
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();
		return "login";
	}
	
	/**
	 * Handle request to the LogOut of Admin
	 * logOutAdmin() method
	 * @return jsp page
	 * @since  :July 14-2017
	 */
	@RequestMapping(value="/logoutStudent")
	public String logOutStudent(HttpServletRequest  request){
		
		// Here Debugging Starts
				PropertyConfigurator.configure(logDebug);
				if(debuglogger.isDebugEnabled())
					
					debuglogger.debug(getClass());
				
				
				
				PropertyConfigurator.configure(logMsg);
				msglogger.info("Logout Request Mapping Successfully");
				
		
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();
		return "login";
	}
}
