package edu.seed.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import edu.seed.dto.BatchBean;
import edu.seed.dto.LoginBean;
import edu.seed.dto.RegistrationBean;

import edu.seed.service.RegistrationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegistrationController {
	
	private static final Logger logger = Logger.getLogger(RegistrationController.class);
	String log4jFile="Z:\\Incubation\\resource\\log4j.properties";

	
	@Autowired(required=true)
	RegistrationServices registerService;
	
	/*
	 * This method is used to mapping of page to register jsp to Admin,Project manager
	 * @param: Model to set object of LoginBena class
	 * @return : String name of the jsp page
	 *
	 */
	@RequestMapping("/registration.pm")
	public String  redirectToRegistration( Model model,HttpServletRequest request)
	{
			model.addAttribute("registrationBean",new RegistrationBean());
			int id = (int) request.getSession().getAttribute("userid");
			List<BatchBean> batch_id_list=registerService.getBatchId(id);
			model.addAttribute("batch_id_list",batch_id_list);
		     return "registration";	    

	}
	

	
	/*
	 * This method is use regitser new intern by Project manager
	 * @param: Model to set object of RegistrationBean class
	 * @return : String name of the jsp page
	 * 
	 */
	@RequestMapping(value ="/registerByPM", method = RequestMethod.POST)
	public String Registration(@ModelAttribute("registrationBean") @Valid RegistrationBean registrationBean,BindingResult result,Model model,HttpServletRequest request)
	{
		
	int id = (int) request.getSession().getAttribute("userid");
	
			System.out.println("register controller");
			registrationBean.setPm_id(id);
			registrationBean.setRoleid(3);
			/*registrationBean.setG_id(0);*/
			/*registrationBean.setB_id(8);*/
			/*registrationBean.setP_id(0);*/
		/*	registrationBean.setPm_id(19);*/
			/*registrationBean.setB_id(8);*/
		/*	registrationBean.setReg_id_fk(201);*/
			
			
			model.addAttribute("registrationBean", registrationBean);
			
			Boolean registerBeanRow =registerService.registration(registrationBean);
			
			String k="Registration Done Sucessfully";
			 model.addAttribute("msg", k);
			return "registration";
		

	}
	/*
	 * This method is used to mapping of batch page to Project manager
	 * @param: Model to set object of LoginBena class
	 * @return : String name of the jsp page
	 *
	 */
	@RequestMapping("/batch.pm")
	public String  redirectToBatch(RegistrationBean registrationBean,HttpServletRequest request,Model model)
	{
			model.addAttribute("batchBean",new BatchBean());
			int id = (int) request.getSession().getAttribute("userid");
			registrationBean.setPm_id(id);
			List<BatchBean> batch_id_list=registerService.getBatchId(id);
			model.addAttribute("batch_id_list",batch_id_list);
		     return "batch";	    

	}
	

	
	/*
	 * This method is use to add new batch by Project manager
	 * @param: Model to set object of BatchBean class
	 * @return : String name of the jsp page
	 * 
	 */
	@RequestMapping(value ="/batchByPM", method = RequestMethod.GET)
	public String Batch(@ModelAttribute("batchBean") BatchBean batchBean,Model model,HttpServletRequest request)
	{
		
		
	int id = (int) request.getSession().getAttribute("userid");
	
			System.out.println("register controller to add batch");
			batchBean.setPm_id(id);
			/*registrationBean.setRoleid(3);*/
			/*registrationBean.setG_id(5);*/
			/*registrationBean.setB_id(8);*/
			/*registrationBean.setP_id(8);*/
		/*	registrationBean.setPm_id(19);*/
			/*registrationBean.setB_id(8);*/
		/*	registrationBean.setReg_id_fk(201);*/
			
			
			model.addAttribute("batchBean", batchBean);
			
			registerService.batch(batchBean);
			String k="Batch Added Sucessfully";
			 model.addAttribute("msg", k);
			return "batch";
		

	}
}
