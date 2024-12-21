package org.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrainerRegisterController {

	@RequestMapping(value="/registerTrainerByAdmin")
	public String  register(){
		
		return "registerTrainer";
	}
}
