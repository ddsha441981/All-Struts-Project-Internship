package org.spring.Controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.spring.Service.ForgotPasswordService;
import org.spring.utiltiy.MailSending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * @author : Deendayal
 * 
 * @param : model to set object of Forgot Password Controller class
 * 
 * @return : String name of the Jsp page (Login Using Role)
 * 
 * @ since :June 30-2017
 */


@Controller
public class ForgotPasswordController {

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
	
	
	@Autowired(required =true)
	private ForgotPasswordService forgotPasswordService;
	
	@Autowired(required = true)
	private MailSending mailSending;
	
	
	/**
	 * Handle request to the Forgot Password page
	 * forgotPasswordMatchPage() Method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@RequestMapping(value="/forgotPasswordPageRedirct")
	public String forgotPasswordMatchPage(){
		
		return "forgotPassword";
	}
	
	/**
	 * Handle request to the Forgot Password and check eamilId existing or not
	 * If existing in database then send password by Email
	 * passwordForgot() method
	 * @return jsp page
	 * @since  :June 30-2017
	 */
	@RequestMapping(value="/forgotPasswordEmailIdChecks")
	public String passwordForgot(Model model,AdminBeans adminBeans,TrainerBeans trainerBeans,StudentBeans studentBeans){
		
		// Here Debugging Starts
				PropertyConfigurator.configure(logDebug);
				if(debuglogger.isDebugEnabled())
					
					debuglogger.debug(getClass());
				//Here Logger Message Properties
				PropertyConfigurator.configure(logMsg);
				msglogger.info("Forgot password Request Mapping");
		
		if(adminBeans.getRole().equalsIgnoreCase("Admin")){
			
			AdminBeans isExistingEmail = forgotPasswordService.adminForgotPassword(adminBeans);
			if(isExistingEmail==null){
				model.addAttribute("Email is not exists", isExistingEmail);
				
				//Here Logger Error Properties
				PropertyConfigurator.configure(logError);
				errorlogger.info("Email is not exists ");
				
				return "Error";

			}
			else{
				System.out.println(isExistingEmail.getEmailId() +" ,"+isExistingEmail.getPassword());
				
				String toEmail = ("EmailId:"+adminBeans.getEmailId());
	    		String sub = "Forgot password sending";
	    		System.out.println(toEmail);
	    		String subject=(sub);
	    		String body=("Welcome "+isExistingEmail.getAdminName() +"\n\nYour Forgot Password Is\n\n\n "+"EmailID:"+isExistingEmail.getEmailId()+"\n"+"Password:"+isExistingEmail.getPassword());
	    		System.out.println(subject);
	    		System.out.println(body);
	    		model.addAttribute("Validemail","We've sent login credentials to your mail");
	    		
	    		//Here Logger Message Properties
				PropertyConfigurator.configure(logMsg);
				msglogger.info("We've sent login credentials to your mail");
		
	    		//mailSender.mailsending(emailsending.getEmail(), subject, body);
	    		mailSending.mailsend(adminBeans.getEmailId(), subject, body);
				
				return "login";
			}
			
			
		}
		
		/**
		 * Handle request to the Forgot Password and check eamilId existing or not
		 * If existing in database then send password by Email
		 * passwordForgot() method
		 * @return jsp page
		 * @since  :June 30-2017
		 */
		else if(trainerBeans.getRole().equalsIgnoreCase("Trianer")){
			
			
			TrainerBeans isExistingEmail = forgotPasswordService.trainerForgotPassword(trainerBeans);
			
			if(isExistingEmail==null){
				model.addAttribute("Email is not exists",isExistingEmail);
				
				//Here Logger Error Properties
				PropertyConfigurator.configure(logError);
				errorlogger.info("Email is not exists ");
				return "Error";

			}
			else{
				System.out.println(isExistingEmail.getEmailId() +" ,"+isExistingEmail.getPassword());
				
				String toEmail = ("EmailId:"+adminBeans.getEmailId());
	    		String sub = "Forgot password sending";
	    		System.out.println(toEmail);
	    		String subject=(sub);
	    		String body=("Welcome "+isExistingEmail.getFname() +"\n\nYour Forgot Password Is\n\n\n "+"EmailID:"+isExistingEmail.getEmailId()+"\n"+"Password:"+isExistingEmail.getPassword());
	    		System.out.println(subject);
	    		System.out.println(body);
	    		model.addAttribute("Validemail","We've sent login credentials to your mail");
	    		
	    		//Here Logger Message Properties
				PropertyConfigurator.configure(logMsg);
				msglogger.info("We've sent login credentials to your mail");
		
	    		
	    		//mailSender.mailsending(emailsending.getEmail(), subject, body);
	    		mailSending.mailsend(adminBeans.getEmailId(), subject, body);
				
				return "login";
			}
		}
		
		/**
		 * Handle request to the Forgot Password and check eamilId existing or not
		 * If existing in database then send password by Email
		 * passwordForgot() method
		 * @return jsp page
		 * @since  :June 30-2017
		 */
		else if(studentBeans.getRole().equalsIgnoreCase("Student")){
			
			StudentBeans isExistingEmail =  forgotPasswordService.studentForgotPassword(studentBeans);
			
			if(isExistingEmail==null){
				model.addAttribute("emailNotExists", "Email is not exists");
				
				//Here Logger Error Properties
				PropertyConfigurator.configure(logError);
				errorlogger.info("Email is not exists");

				return "Error";
			}
			else{
				System.out.println(isExistingEmail.getEmailId() +" ,"+isExistingEmail.getPassword());
				
				String toEmail = ("EmailId:"+adminBeans.getEmailId());
	    		String sub = "Forgot password sending";
	    		System.out.println(toEmail);
	    		String subject=(sub);
	    		String body=("Welcome "+isExistingEmail.getUserName() +"\n\nYour Forgot Password Is\n\n\n "+"EmailID:"+isExistingEmail.getEmailId()+"\n"+"Password:"+isExistingEmail.getPassword());
	    		System.out.println(subject);
	    		System.out.println(body);
	    		model.addAttribute("Validemail","We've sent login credentials to your mail");
	    		
	    		//Here Logger Message Properties
				PropertyConfigurator.configure(logMsg);
				msglogger.info("We've sent login credentials to your mail");
		
	    		
	    		//mailSender.mailsending(emailsending.getEmail(), subject, body);
	    		mailSending.mailsend(adminBeans.getEmailId(), subject, body);
				
				return "login";
			
		}
		
		
		}
		
		//Here Logger Error Properties
		PropertyConfigurator.configure(logError);
		errorlogger.info("Page Not found ");

		
		return "404";
		
	}
	
}
