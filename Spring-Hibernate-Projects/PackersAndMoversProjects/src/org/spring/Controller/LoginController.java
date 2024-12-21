package org.spring.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.Services.AdminLoginServices;
import org.spring.Services.AgentLoginServices;
import org.spring.dto.AdminBeans;
import org.spring.dto.AgentBeans;
import org.spring.dto.ClientBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	final public static Logger logger =Logger.getLogger(ForgotPasswordController.class);
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(ForgotPasswordController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(ForgotPasswordController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\DebugLog4J.properties";
	

	@Autowired(required = true)
	AdminLoginServices adminLoginServices;

	@Autowired(required = true)

	AgentLoginServices agentLoginServices;

	@RequestMapping(value = "/loginPageRedirctControllers")
	public String LoginAllUsers(AdminBeans adminBeans, AgentBeans agentBeans, ClientBeans clientBeans, Model model,
			BindingResult result, HttpServletRequest request) {

		//System.out.println("In AfterClick Login Page Controller");
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		PropertyConfigurator.configure(log4jerror);
		loggerError.error("Request Not Mapped"/*,new Throwable()*/);
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debugging");
		
		
		model.addAttribute("adminBeans", new AdminBeans());
		if (adminBeans.getUserRole().equalsIgnoreCase("admin")) {

			int adminId = adminLoginServices.adminLoginCredientials(adminBeans);
			if (adminId > 0) {

				request.getSession().setAttribute("adminId", adminId);
				model.addAttribute("adminloginMsg", "Admin SuccessFully Login");
				
				PropertyConfigurator.configure(log4jmsg);
				logger.info("Request SuccessFully Mapped");
				
				/*PropertyConfigurator.configure(log4jerror);
				loggerError.error("Request Not Mapped",new Throwable());
				*/
				PropertyConfigurator.configure(log4jdebug);
				loggerDebug.debug("Debugging");
				
				
				return "adminProfile";
			} else {

				model.addAttribute("adminloginMsg", "Email and Password doesn't match");
				PropertyConfigurator.configure(log4jerror);
				loggerError.error("Email and Password doesn't match",new Throwable());
				return "Error";
			}

		} else if (agentBeans.getUserRole().equalsIgnoreCase("agent")) {

			int agentId = agentLoginServices.agentLoginMethodCall(agentBeans);
			if (agentId > 0) {
				// session Id Set
				request.getSession().setAttribute("agentId", agentId);

				model.addAttribute("agentloginMsg", "Agent SuccessFully Login");
				
				PropertyConfigurator.configure(log4jmsg);
				logger.info("Agent SuccessFully Login");
				
				/*PropertyConfigurator.configure(log4jerror);
				loggerError.error("Request Not Mapped",new Throwable());
				*/
				PropertyConfigurator.configure(log4jdebug);
				loggerDebug.debug("Debugging");
				
				return "agentProfile";
			} else {
				model.addAttribute("agentloginMsg", "Email and Password doesn't match");
				
				PropertyConfigurator.configure(log4jerror);
				loggerError.error("Email and Password doesn't match"/*,new Throwable()*/);
				return "Error";
			}

		}

		else if (clientBeans.getUserRole().equalsIgnoreCase("client")) {
			return "clientProfile";

		}

		else {
			model.addAttribute("ErrorMsg", "Error Page");

			PropertyConfigurator.configure(log4jerror);
			loggerError.error("Error Page");
			return "Error";
		}
	}

}
