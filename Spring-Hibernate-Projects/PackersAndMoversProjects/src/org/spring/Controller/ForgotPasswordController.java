package org.spring.Controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.Services.ForgotPasswordServices;
import org.spring.dto.AgentBeans;
import org.spring.dto.ClientBeans;
import org.spring.dto.SelectBeans;
import org.spring.utility.MailSending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForgotPasswordController {

	final public static Logger logger =Logger.getLogger(ForgotPasswordController.class);
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(ForgotPasswordController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(ForgotPasswordController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\DebugLog4J.properties";
	
	
	@Autowired(required = true)
	ForgotPasswordServices forgotPasswordServices;
	

	  @Autowired(required =true)
	  private MailSending mailsending;
	
	
	@RequestMapping(value = "/selectedforgotPassword")

	public String selectRegister(SelectBeans selectBeans, AgentBeans agentBeans, ClientBeans clientBeans, Model model) {

		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		PropertyConfigurator.configure(log4jerror);
		loggerError.error("Request Not Mapped"/*,new Throwable()*/);
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Request Not Mapped");
		
		//System.out.println("In Select User For Forgot PassWord");
		
		if (selectBeans.getForgotPasswordSelect().equalsIgnoreCase("agent")) {

			PropertyConfigurator.configure(log4jmsg);
			logger.info("Request SuccessFully Mapped");
			
			PropertyConfigurator.configure(log4jdebug);
			loggerDebug.debug("Debugging");
			
			model.addAttribute("agentBeans", new AgentBeans());

			return "agentForgot";

		}

		else if (selectBeans.getForgotPasswordSelect().equalsIgnoreCase("client")) {

			PropertyConfigurator.configure(log4jmsg);
			logger.info("Request SuccessFully Mapped");
			
			PropertyConfigurator.configure(log4jdebug);
			loggerDebug.debug("Debugging");
			
			model.addAttribute("clientBeans", new ClientBeans());
			return "clientForgot";
		}

		else {
			
			model.addAttribute("registerMsg", "You does't select any data");
			PropertyConfigurator.configure(log4jerror);
			loggerDebug.debug("You does't select any data");
			
			return "Error";
		}

	}

	@RequestMapping(value = "/agentForgotPasswordAfterSubmiting")
	public String agentsPasswordOfForgots(@ModelAttribute(value = "agentBeans") AgentBeans agentBeans, Model model,
			BindingResult result) {

		//System.out.println("In Agent Forgot Password");
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debuging");
		
		AgentBeans	isemailExistsRowbean = forgotPasswordServices.agentsForgotsPasswordFetch(agentBeans);
		if(isemailExistsRowbean == null){
			
			model.addAttribute("emailNotExists", "Your Email Doesn't exists in database");
			PropertyConfigurator.configure(log4jdebug);
			loggerDebug.debug("Your Email Doesn't exists in database");
			
			return "Error";
		}
		else{
System.out.println(isemailExistsRowbean.getEmailId() +" ,"+isemailExistsRowbean.getAutoPassword());
			
			String toEmail = ("EmailId:"+agentBeans.getEmailId());
    		String sub = "Forgot password sending";
    		System.out.println(toEmail);
    		String subject=(sub);
    		String body=("Welcome "+isemailExistsRowbean.getName() +"\n\nYour Forgot Password Is\n\n\n "+"EmailID:"+isemailExistsRowbean.getEmailId()+"\n"+"Password:"+isemailExistsRowbean.getAutoPassword());
    		System.out.println(subject);
    		System.out.println(body);
    		model.addAttribute("Validemail","We've sent login credentials to your mail");
    		//mailSender.mailsending(emailsending.getEmail(), subject, body);
    		mailsending.mailsend(agentBeans.getEmailId(), subject, body);
		
    		PropertyConfigurator.configure(log4jmsg);
    		logger.info("Request SuccessFully Mapped and Mail Send SuccessFully ");
    		
    		PropertyConfigurator.configure(log4jdebug);
    		loggerDebug.debug("Debuging");
    		
		return "welcome";
		}
	}

}
