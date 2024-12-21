package org.spring.client.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.spring.agent.beanofAgent.PolicyHolderRegister;
import org.spring.client.beanclasses.ClientLogin;
import org.spring.client.repositries.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Deendayal
 * @since
 * @version 1.1.2
 */

/** This class is Controller class
 *  some methods delcared
 *  Used Logger
 */
@Controller
public class ClientContoller {
	@Autowired
	ClientDao clientdao;
	
	/**
	 *  clientLoginUsingOwnUser() is method name of controller
	 *  clientLoginUsingNamePass() method used to retrive data From Database for Particular Client Using Their Id
	 *  Request Mapping when client Login
	 *  clientLoginInfo is form action
	 *  Used model to show some message
	 *  Return type is String and return profileOfpolicyHolder.jsp page
	 */
	public static final Logger logger = Logger.getLogger(PolicyHolderRegister.class);
	
	
	@RequestMapping(value="/clientLoginInfo",method=RequestMethod.POST)
	public String  clientLoginUsingOwnUser(ClientLogin clientlogin,Model model,HttpServletRequest request){
		
		int iId = clientdao.clientLoginUsingNamePass(clientlogin);
		if(iId>0){
			request.getSession().setAttribute("clientOfId", iId);
			ClientLogin clientinfo = clientdao.clientselectDataOfProfileManage(iId);
			model.addAttribute("clientProfile", clientinfo);
		}
		else{
			
			System.out.println("Error");
			 model.addAttribute("UserName and Password Not Match");
			 return "ClientLogin";
		}
		
		
		return "profileOfpolicyHolder";
	}
	

}
