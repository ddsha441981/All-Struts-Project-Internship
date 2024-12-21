package org.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.spring.BeansClass.TestBean;
import org.spring.repositry.TestDao;
import org.spring.utility.GeneratedOTP;
import org.spring.utility.MailSending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@Autowired(required = true)
	MailSending mailsending;
	
	@Autowired(required = true)
	TestDao testDao;
	
	@RequestMapping(value="/goToLinkPageOTP")
	public String nextOTP(TestBean testBean,Model model){
		
		System.out.println("In Test Login  Controller");
		
		model.addAttribute("testBean", new TestBean());
		model.addAttribute("testBean", testBean);
		
		return "testLogin";
	}
	
	@RequestMapping(value="/testForOTP")
	public String myOTP(@ModelAttribute(value ="testBean")TestBean testBean,Model model,BindingResult result,HttpServletRequest request){
		
		System.out.println("In Test  OTP Controller");
		
		String loginOtp = GeneratedOTP.generateOTP();
		System.out.println("Now Your OTP Password is "+loginOtp);
		
		testBean.setLoginOtp(loginOtp);
		int otpValue = testDao.saveLoginData(testBean);
		
		System.out.println("Your Login OTP value is "+otpValue);
		
			request.getSession().setAttribute("loginId", "loginId");
		
		if(otpValue > 0){
			
			String toEmail = ("EmailId:"+testBean.getName());
			String sub = "Your OTP";
			System.out.println(toEmail);
			String subject=(sub);
			String body=("Welcome  Your OTP is \n\n\n "+"OTP :- " +testBean.getLoginOtp()+" ");
			System.out.println(subject);
			System.out.println(body);
			model.addAttribute("Validemail","We've sent login credentials to your mail");
			//mailSender.mailsending(emailsending.getEmail(), subject, body);
			mailsending.mailsend(testBean.getName(), subject, body);
			
			model.addAttribute("testBean", new TestBean());
			//model.addAttribute("testBean", testBean);
			return "testOTP";
		}
		else{
			
			return "Error";
		}
		
		
		
		
	}
	
	@RequestMapping(value="/accpetsOTP")
	public String myOTPRecived(@ModelAttribute(value ="testBean")TestBean testBean,Model model,BindingResult result,HttpServletRequest request){
		
		System.out.println("In Test  OTP Controller");
		
		/*int loginId = (int) request.getSession().getAttribute("loginId");
		testBean.setLoginId(loginId);*/
		//testBean.setLoginOtp();
		
		TestBean j = testDao.selectDataUsingOTP(testBean);
		System.out.println("Now Your OTP is Match"+j);
		model.addAttribute("testBean", new TestBean());
		model.addAttribute("testBean", testBean);
		
		return "profile";
	}

}
