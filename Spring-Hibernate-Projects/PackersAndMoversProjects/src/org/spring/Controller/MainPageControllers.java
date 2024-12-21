package org.spring.Controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.dto.AdminBeans;
import org.spring.dto.SelectBeans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageControllers {
	
	final public static Logger logger =Logger.getLogger(ForgotPasswordController.class);
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(ForgotPasswordController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(ForgotPasswordController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\DebugLog4J.properties";
	

	@RequestMapping(value = "/PageRedirectFromHomeToLogin")
	
	public String LoginAllUsers(AdminBeans adminBeans,Model model){
		
	//	System.out.println("In Login main Controller");
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		PropertyConfigurator.configure(log4jerror);
		loggerError.error("Request Not Mapped"/*,new Throwable()*/);
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debugging");
		
		
		
		
		model.addAttribute("adminBeans", new AdminBeans());
		return "login";
	}
	
	@RequestMapping(value = "/userRegister")

	public String register( SelectBeans selectBeans ,Model model){
	
	//System.out.println("In Register Main Controller");
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debugging");
		
		
	
	model.addAttribute("selectBeans", new SelectBeans());
	return "selectRegister";
	}
	
	@RequestMapping(value = "/forgetPasswordUser")

	public String forgetPasswordByUsers( SelectBeans selectBeans ,Model model){
	
	//System.out.println("In ForgotPassword Main Controller");
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debugging");
		
	
	model.addAttribute("selectBeans", new SelectBeans());
	return "selectForgotPassword";
	}
	
	
}
