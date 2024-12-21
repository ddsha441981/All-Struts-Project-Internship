package org.spring.CustomerController;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.CustomerBeans.ChangePwdBeans;
import org.spring.CustomerDaoImpl.CustomersDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomersController {

	public static Logger  logger = Logger.getLogger(CustomersController.class);
	
	@Autowired(required = true)
	CustomersDaoImpl custDaoImpl;
	
	@RequestMapping(value = "/changeOwnPasswordByCustomers",method = RequestMethod.GET)
	public String changeCustomersOwnPassword(ChangePwdBeans pwdBeans,HttpServletRequest request,Model model){
		
		logger.info("Change Password Method SuccessFully Executed");
		int custId = (int) request.getSession().getAttribute("customId");
		pwdBeans.setCustId(custId);
		custDaoImpl.changeCustomersPassword(pwdBeans);
		
		logger.info("Your Password SuccessFully Changed");
		
		
		model.addAttribute("msg", "Your Password SuccessFully Changed");
		return "customerProfile";
	}
}
