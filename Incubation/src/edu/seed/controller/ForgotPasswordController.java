package edu.seed.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.seed.dto.EmailSendingBean;
import edu.seed.repository.EmailSendingDao;
import edu.seed.service.RegisterService;
import edu.seed.util.MailSending;

@Controller
public class ForgotPasswordController {
	    
	
	    
	@Autowired(required =true)
	RegisterService registerService;
	
	  @Autowired(required =true)
	  private JavaMailSender mailSender;
	 
	  @Autowired(required =true)
	  MailSending  mailsending;
	  
	  
	/*@RequestMapping("/Loginaction")
	public String redirectToforgot(Model model)
	{
		return "login";
		
	}*/

    @RequestMapping("/forgotpassword")
	public String redirectToLogin(Model model){
    	System.out.println("mapping of request");
		model.addAttribute("EmailSending", new EmailSendingBean());
		return "forgotpassword";
	}// end of redirectToLogin
	
	
	

	@RequestMapping(value="/sendpassword" ,method = RequestMethod.POST)
	public String forgotpassword(@ModelAttribute("EmailSending") @Valid EmailSendingBean emailsending,BindingResult result,Model model){  
        model.addAttribute("EmailSending", new EmailSendingBean());
            System.out.println("in forgot method");
	  
            if(result.hasErrors())                                                                            
            {
            	return "forgotpassword";
            }
            else
            {
            	model.addAttribute("EmailSending", emailsending);
            	EmailSendingBean isemailExistsRowbean =registerService.isEmailExists(emailsending);
            	
            	if(isemailExistsRowbean==null)
            	{
            		model.addAttribute("emailisNotExists", "email not exists");
            		return "forgotpassword";
            	}else
            	{
            		String toEmail = ("EmailId:"+emailsending.getEmail());
            		String sub = "Forgot password sending";
            		System.out.println(toEmail);
            		String subject=(sub);
            		String body=("EmailID:"+isemailExistsRowbean.getEmail()+"\n"+"Password:"+emailsending.getPassword());
            		System.out.println(subject);
            		System.out.println(body);
            		model.addAttribute("Validemail","We've sent login credentials to your mail");
            		//mailSender.mailsending(emailsending.getEmail(), subject, body);
            		mailsending.mailsend(emailsending.getEmail(), subject, body);
    				return "forgotpassword";
            	}
            	
            }

    }  
	
	
}
