package org.spring.Controller;

import javax.validation.Valid;

import org.spring.Beans.BeansClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*@RestController*/
@Controller
public class RegisterController {

	@RequestMapping(value = "/redirectPage")
	public String redirect(Model model){
		System.out.println("In Controller 1");
		
		model.addAttribute("beansclass",  new BeansClass());
		
		return "register";
	}
	
	@RequestMapping(value = "/formSubmit",method=RequestMethod.POST)
	public String myRegisterContents( @ModelAttribute(value = "beansclass") @Valid BeansClass beansclass,BindingResult result,Model model){
		System.out.println("In Controller 2");
		//String f="Hello "+beansclass.getUsername();
		/*model.addAttribute("beansclass", new BeansClass());*/
		//model.addAttribute("beansclass",  new BeansClass());
		if(result.hasErrors()){
			
			return "register";
		}
		
			return "welcome";
		
		
	}
}
