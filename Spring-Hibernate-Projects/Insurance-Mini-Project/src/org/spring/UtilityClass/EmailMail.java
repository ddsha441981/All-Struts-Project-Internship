package org.spring.UtilityClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;  
public class EmailMail {

	@Autowired(required = true)
	public static MailSender mailSender;
	
	
	
	
	public MailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public  static String sendMail(String from, String to, String subject, String msg) {  
		
		System.out.println("In MailMail Class");
        //creating message  
        SimpleMailMessage message = new SimpleMailMessage();        
        message.setFrom(from);  
        message.setTo(to);  
        message.setSubject(subject);  
        message.setText(msg);  
        System.out.println("Here Mails Property" + message.toString());
        //sending message  
        System.out.println("Mail Sender " + from);
        System.out.println("Mail Receiver " + to);
        System.out.println("Mail Subject " + subject);
        System.out.println(msg);
        mailSender.send(message);
        
		return "emailValues";     
    }  
	
	 
}
