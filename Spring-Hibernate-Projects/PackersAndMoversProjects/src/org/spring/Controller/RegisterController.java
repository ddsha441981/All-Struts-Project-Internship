package org.spring.Controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.Services.AgentRegisterService;
import org.spring.dto.AdminBeans;
import org.spring.dto.AgentBeans;
import org.spring.dto.ClientBeans;
import org.spring.dto.SelectBeans;
import org.spring.utility.AutoGerneratedPassword;
import org.spring.utility.MailSending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	
	final public static Logger logger =Logger.getLogger(ForgotPasswordController.class);
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(ForgotPasswordController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(ForgotPasswordController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\PackersAndMoversProjects\\resources\\DebugLog4J.properties";
	
	
	@Autowired(required = true)
	MailSending mailSending;

	
	@Autowired(required = true)
	AgentRegisterService agentRegisterService;
	
	@RequestMapping(value = "/selectedRegisterUser")

	public String selectRegister(SelectBeans selectBeans,AgentBeans agentBeans,ClientBeans clientBeans,Model model){
	
	//System.out.println("In Select User For Register");
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		PropertyConfigurator.configure(log4jerror);
		loggerError.error("Request Not Mapped"/*,new Throwable()*/);
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debugging");
		
	
	if(selectBeans.getRegisterSelect().equalsIgnoreCase("agent")){
		
		model.addAttribute("agentBeans", new AgentBeans());
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debugging");
		
		
		return "agentRegister";
		
	}
	
	else if(selectBeans.getRegisterSelect().equalsIgnoreCase("client")){
		
		model.addAttribute("clientBeans", new ClientBeans());
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debugging");
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		return "clientRegister";
	}
	
	else{
		
		model.addAttribute("registerMsg", "You does't select any data");
		PropertyConfigurator.configure(log4jerror);
		loggerError.error("You does't select any data"/*,new Throwable()*/);
		
		return "Error";
	}
	
	}
	
	@RequestMapping(value = "/agentRegisterDataSubmitingForm")
	public String registerMyAgents(@ModelAttribute(value = "agentBeans")AgentBeans agentBeans,Model model,BindingResult result){
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Request SuccessFully Mapped");
		
		PropertyConfigurator.configure(log4jerror);
		loggerError.error("Request Not Mapped"/*,new Throwable()*/);
		
		PropertyConfigurator.configure(log4jdebug);
		loggerDebug.debug("Debugging");
		
		
		
		//Here Auto Generated Password code....
		String autoPassword = AutoGerneratedPassword.GeneratedPassword();
		agentBeans.setAutoPassword(autoPassword);
		System.out.println("here auto passord is"+autoPassword);
		
		PropertyConfigurator.configure(log4jmsg);
		logger.info("Auto Generated Password successfully done");
		
		int count = agentRegisterService.saveRegisterDataForAgent(agentBeans);
		if(count>0){
			
			String toEmail = ("EmailId:"+agentBeans.getEmailId());
			String sub = "Agent Register SuccessFully";
			System.out.println(toEmail);
			String subject=(sub);
			String body=("Welcome "+agentBeans.getName()+" Your Registeration SuccessFully Done\n\n\n "+"EmailID :- " +agentBeans.getEmailId()+"\n"+"Auto Generated Password :- " +agentBeans.getAutoPassword()+" ");
			System.out.println(subject);
			System.out.println(body);
			model.addAttribute("Validemail","We've sent login credentials to your mail");
			//mailSender.mailsending(emailsending.getEmail(), subject, body);
			mailSending.mailsend(agentBeans.getEmailId(), subject, body);
			
			System.out.println("Agent Register is "+count);
			model.addAttribute("agentRegisterMsg", "Agent Register SuccessFully Done");
			
			PropertyConfigurator.configure(log4jmsg);
			logger.info("Agent Register SuccessFully Done");
			
			return "welcome";
		}
		else{
			System.out.println("Agent Register is "+count);
			model.addAttribute("agentRegisterMsg", "You Get Error");
			
			PropertyConfigurator.configure(log4jerror);
			loggerError.error("You Get Error"/*,new Throwable()*/);
			
			return "Error";
		}
		
	}

}
