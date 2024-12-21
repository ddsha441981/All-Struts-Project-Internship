package edu.seed.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.seed.dto.InternProfileBean;
import edu.seed.service.InternProfileServices;

@Controller
public class InternProfileController {
	private static final Logger logger = Logger.getLogger(InternProfileController.class);
	

	
	@Autowired(required=true)
InternProfileServices internprofileservices;
	
	@RequestMapping(value="/internProfile")
	public String redirectInternprofile(Model model,InternProfileBean internprofilebean){
		
		
		System.out.println("In Controll");
		
	model.addAttribute("internprofile", new InternProfileBean());
		return "incubationProfile";
	}


	/*
	 * @author : Ramchandra Teke
	 * @param : model to set object of loginBean class
	 * @return : String name of the Jsp page
	 * @ since :march 27-2017
	 */

	@RequestMapping(value="/InternProfileaction" ,method=RequestMethod.POST)
	public String redirectInternprofileOnsubmit( @ModelAttribute("internprofilebean") @Valid InternProfileBean internprofilebean,BindingResult result,Model model){
	
	
		System.out.println("In Action Redirect Page");
		
		int userid = 29; // get this from session.
		internprofileservices.internProfile(internprofilebean, userid);
		logger.info("In Controller Logger");
		
	model.addAttribute("internprofile", new InternProfileBean());
	model.addAttribute("success", "Intern Profile Created...!");

		return "incubationProfile";

		
	
}
}



