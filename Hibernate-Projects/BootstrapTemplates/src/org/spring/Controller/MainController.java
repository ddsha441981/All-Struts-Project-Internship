package org.spring.Controller;

import java.util.List;
import java.util.logging.Logger;

import org.spring.Bean.BeanClass;
import org.spring.Bean.DemoBeansAjax;
import org.spring.repositaries.ReposiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@Autowired(required = true)
	ReposiDao reposidao;
	
	org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MainController.class);
	
	@RequestMapping(value = "/registerPage",method = RequestMethod.GET)
	
	public String toRedirectRegisterPage(){
		logger.info("Page Redirect to Register Page Successfully");
		
		return "register";
		
	}
	
/*@RequestMapping(value = "/demoAjax",method = RequestMethod.GET)
	
	public String demo(){
		logger.info("In Controller of register demo file for ajax and jquery test");
		
		
		return "j";
	}

@RequestMapping(value = "/ajaxJqueryForm",method = RequestMethod.GET)

	public @ResponseBody String demoAjaxFile(@ModelAttribute(value ="beansAjax") DemoBeansAjax beansAjax){
		logger.info("In Controller of register demo file for ajax and jquery test successfully Mapping");
	System.out.println("In Ajax Controller");
	beansAjax.getName();
	beansAjax.getPwd();
	beansAjax.getAge();
	beansAjax.getSalary();
	beansAjax.toString();
		
		return "viewpart";
}*/
	
	@RequestMapping(value = "/redirectMainPage",method = RequestMethod.GET)
	
	public String myPageRedirect(BeanClass beanclass,Model model){
		logger.info("In Controller");
		List<BeanClass> j = reposidao.getContents();
		//System.out.println(j.size());
		model.addAttribute("list", j);
		return "viewpart";
	}
}
