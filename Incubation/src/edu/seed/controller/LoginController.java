package edu.seed.controller;

import javax.validation.Valid;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.seed.dto.InternProfileBean;
import edu.seed.dto.LoginBean;
import edu.seed.repository.LoginDao;
import edu.seed.service.LoginServices;

@Controller
public class LoginController {

	final static Logger logger = Logger.getLogger(LoginController.class);
	String log4jFile = "Z:\\Incubation\\resource\\log4j.properties";

	@Autowired(required = true)
	LoginServices loginServices;

	@RequestMapping(value = "login")
	public String redirectToLogin(Model model) {

		System.out.println("In Methods///////////////");

		model.addAttribute("loginBean", new LoginBean());
		return "login";
	}

	/*
	 * @author : Abhaysingh
	 * 
	 * @param : model to set object of loginBean class
	 * 
	 * @return : String name of the Jsp page
	 * 
	 * @ since :march 13-2017
	 */

	@RequestMapping(value = "/LoginServlet", method = RequestMethod.POST)
	public String Login(Model model, @ModelAttribute("loginBean")LoginBean loginBean, BindingResult result,
			HttpServletRequest request, HttpSession httpSession) {
		// logger.info("name of jsp page");

		String viewName = "login";
		if (result.hasErrors()) {
			return viewName;
		} else {

			logger.info("name of jsp page");
			System.out.println("\n In DB");
			model.addAttribute("loginBean", loginBean);
			LoginBean loginBeanRow = loginServices.login(loginBean);
			/* System.out.println(loginBeanRow.getRoleid()); */
			System.out.println(loginBeanRow);
			if (loginBeanRow == null) {
				model.addAttribute("Invalid", "Invalid Username/password");
				System.out.println("Invalid Userid/Password");
				viewName = "login";

			} else {
				httpSession = request.getSession(); // to get the session
				httpSession.setAttribute("userid", loginBeanRow.getUserid());
				httpSession.setAttribute("roleid", loginBeanRow.getRoleid());
				System.out.println("id : " + loginBeanRow.getRoleid());
				if (loginBeanRow.getRoleid() == 2) { // Project manager
					viewName= "pm-home";
				} 
				else if (loginBeanRow.getRoleid() == 3) // Intern
				{
					model.addAttribute("internprofile", new InternProfileBean());
					viewName= "incubationProfile";
				}
			}
		}
		System.out.println("Page Name : "+viewName);
		return viewName;
	}
}
