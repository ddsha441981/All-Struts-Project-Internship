package org.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@Autowired
	UserDao user;
	
	
	
	
	/*@RequestMapping(value = "/helllllo",method = RequestMethod.POST)
	public String hiii( ){
		
		return "hello2";
		
		
	}
	
	
	@RequestMapping(value = "/addData",method = RequestMethod.POST)
	public String nextPage( Getter getter){
		
		user.adddata(getter);
		
		return "hello";
		
		
	}*/
	
	
	@RequestMapping(value = "/mappingofTemplates")
	public String hello( ){
		
		return "signin";
		
		
	}
	

		@RequestMapping(value = "/signinAdmin")
		public String adminloginRedirectPage(Getter getter){
			System.out.println("In Controller");
			user.adddata(getter);
			return "index";
			
			
		}
		
		@RequestMapping(value = "/signUp")
		public String signUpRedirectPage(){
			return "signin";
			
			
		}
}
