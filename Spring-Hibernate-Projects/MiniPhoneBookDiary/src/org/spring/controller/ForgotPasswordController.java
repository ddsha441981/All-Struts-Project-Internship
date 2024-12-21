package org.spring.controller;

import org.apache.log4j.Logger;
import org.spring.BeansClass.ForgetPasswordBeans;
import org.spring.Services.ForgotPasswordService;
import org.spring.utility.MailSending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ForgotPasswordController {

	final public static Logger logger =Logger.getLogger(ForgotPasswordController.class);
	 String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\MsgLog4J.properties";
	final public static Logger loggerError =Logger.getLogger(ForgotPasswordController.class);
	 String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\ErrorLog4JError.properties";
	final public static Logger loggerDebug =Logger.getLogger(ForgotPasswordController.class);
	 String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\MiniPhoneBookDiary\\resources\\DebugLog4J.properties";
	

	  @Autowired(required =true)
	  private MailSending mailsending;
	
	@Autowired(required = true)
	ForgotPasswordService forgotPasswordService ;
	
	
	@RequestMapping(value ="/forgetPasswordUser")
	public String forgetPasswordContents(ForgetPasswordBeans forgotPasswordBeans,Model model){
	//	System.out.println("In Forget Password Controller");
		
		model.addAttribute("forgotPasswordBeans", new ForgetPasswordBeans());
		
		return "forgetPasswordUsers";
	}
	
	@RequestMapping(value ="/forgotpasswordOfUsers",method=RequestMethod.GET)
	public String mainControllerOfForgetPassword(@ModelAttribute("forgotPasswordBeans")ForgetPasswordBeans forgotPasswordBeans,BindingResult result,Model model){
		
		System.out.println("In Forget Password Controller");
		
		model.addAttribute("forgotPasswordBeans", new ForgetPasswordBeans());
		//forgotPasswordBeans.getAutoPassword(); 
		
		ForgetPasswordBeans	isemailExistsRowbean = forgotPasswordService.forgotPasswordGetFromDataBase(forgotPasswordBeans);
		//System.out.println("Emakndkdkjvncfxkjbncfm"+isemailExistsRowbean);
		if(isemailExistsRowbean==null){
			
			model.addAttribute("emailNotExists", "Your Email Doesn't exists in database");
			
			return "forgetPasswordUsers";
		}
		else{
			System.out.println(isemailExistsRowbean.getEmail() +" ,"+isemailExistsRowbean.getAutoPassword());
			
			String toEmail = ("EmailId:"+forgotPasswordBeans.getEmail());
    		String sub = "Forgot password sending";
    		System.out.println(toEmail);
    		String subject=(sub);
    		String body=("Welcome "+isemailExistsRowbean.getUsername() +"\n\nYour Forgot Password Is\n\n\n "+"EmailID:"+isemailExistsRowbean.getEmail()+"\n"+"Password:"+isemailExistsRowbean.getAutoPassword());
    		System.out.println(subject);
    		System.out.println(body);
    		model.addAttribute("Validemail","We've sent login credentials to your mail");
    		//mailSender.mailsending(emailsending.getEmail(), subject, body);
    		mailsending.mailsend(forgotPasswordBeans.getEmail(), subject, body);
			return "welcome";
		}
		
	}
}
