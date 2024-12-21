package org.spring.TestController;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestControllers {

	@RequestMapping("/mappppppp")
	public String check(MyBean myBean){
		System.out.println("In controller");
		
		return "Test";
	}
	
	

		@RequestMapping(value = "/MappingData",method = RequestMethod.GET)
		public String checkFrom(@ModelAttribute("myBean")@Valid MyBean myBean,BindingResult result,Model model){
			System.out.println("In controller");
			model.addAttribute("myBean",  new MyBean());
			model.addAttribute("datas", myBean);
			return "welcome";
		}
}
