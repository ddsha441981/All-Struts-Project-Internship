package org.spring.utiltiy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSending {
	       
		   @Autowired(required = true)
		   private JavaMailSender mailSender;
		   
		public void mailsend(String toEmail,String subject,String body)
		{
			System.out.println("i am in mail sending method");
			  SimpleMailMessage msg = new SimpleMailMessage();
			     msg.setTo(toEmail);
			     msg.setSubject(subject);
			     msg.setText(body);
			     
			     mailSender.send(msg);
			     System.out.println("ending of mail sending code");
			return ;
			
		}
}
