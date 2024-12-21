package org.demo.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {

	@RequestMapping(value = "/redirectPageFromIndexToHome",method=RequestMethod.GET)
	public String redirectPage(){
		System.out.println("In Home Controller");
		return "home";
	}
	

	@RequestMapping(value = "/redirectPageFromHomeToRegister",method=RequestMethod.GET)
	public String redirectPageToRegister(){
		System.out.println("In Home Controller");
		return "register";
	}

}
