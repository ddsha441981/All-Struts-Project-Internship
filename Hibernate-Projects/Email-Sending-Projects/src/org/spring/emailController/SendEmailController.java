package org.spring.emailController;

import org.spring.emailBeans.EmailBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 @author Deendayal
 @since 7 march 2017
 @version 1.1.2
 */
@Controller
public class SendEmailController {

	@Autowired
	JavaMailSender javamailsend;
	
	@RequestMapping(value = "/sendingEMail")
	
	public String requestRedirect(){
		System.out.println("Email Form Method executed");
		return "EmailForm";
		
	}
	
	@RequestMapping(value = "/sendEmail",method = RequestMethod.POST)
	 
	public String sendingEmails(EmailBeans emailbean){
		System.out.println(emailbean.getRecipient());
		System.out.println(emailbean.getSubject());
		System.out.println(emailbean.getMessage());
		
		// creates a simple e-mail object
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(emailbean.getRecipient());
		email.setSubject(emailbean.getSubject());
		email.setText(emailbean.getMessage());
		
		//send the mail
		javamailsend.send(email);
		
		return "Result";
	}
}
