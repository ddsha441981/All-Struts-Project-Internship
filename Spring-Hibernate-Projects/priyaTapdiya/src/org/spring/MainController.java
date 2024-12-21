package org.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	

	@RequestMapping(value="/redirectPage")
	public String mainData(){
		
		System.out.println("In Index Page ");
		return "index";
	}
	@RequestMapping(value="/form_controlssc")
	public String ssc(){
		
		
		return "form_controls";
	}
	@RequestMapping(value="/form_controlHsc")
	public String Hsc(){
		
		
		return "form_controls";
	}
	@RequestMapping(value="/form_controldiploma")
	public String diploma(){
		
		
		return "form_controls";
	}
}
