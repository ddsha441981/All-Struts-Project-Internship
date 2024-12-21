package org.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.spring.beanclass.Department;
import org.spring.beanclass.Loginbean;
import org.spring.repositries.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginController.
 */
@Controller
public class LoginController {
	
	/** The dao. */
	@Autowired
	LoginDao dao;
	
	
	
	/**
	 * Profile.
	 *
	 * @return the string
	 */
	@RequestMapping(value="/loginpage")
	public String profile(){
		System.out.println("In Login Page");
		
		
		return "login";
	}
	
	/**
	 * Loginprofile.
	 *
	 * @param login the login
	 * @param request the request
	 * @return the string
	 */
	@RequestMapping(value="/logindata")
	public String loginprofile(Loginbean login,HttpServletRequest request){
		System.out.println("In Login Method");
		 request.getSession().setAttribute("userId",login.getId());
		//dao.createtable();
		 
		//session.setAttribute("loginId", login.getId());
		
		
		//dao.savedata(login);
		
		return "welcome";
	}
	
	/**
	 * Departmentprofile.
	 *
	 * @return the string
	 */
	@RequestMapping(value="/department")
	public String departmentprofile(){
		System.out.println("In Department Method");
		
		
		return "departmentdetails";
	}
	
	/**
	 * Departmentsave.
	 *
	 * @param dep the dep
	 * @return the string
	 */
	@RequestMapping(value="/departmentdata")
	public String departmentsave(Department dep){
		System.out.println("In Department Method");
		
		//dao.createtableofdepartment();
		
		//dao.saveIndepartment(dep);
		return "welcomedepartment";
	}
	
	/**
	 * View.
	 *
	 * @param login the login
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value="/view")
	public String view(Loginbean login,Model model){
		System.out.println("In Login Method");
		
		List list = dao.mappinglogin();
		model.addAttribute("K1", list);
		
		return "welcome";
	}
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 * @return the string
	 */
	@RequestMapping(value="/deletedata/{id}")
	public String delete(@PathVariable Integer id){
		System.out.println("In Delete Method");
		
		 dao.deletebyId(id);
		
		
		return "welcome";
	}
	
	/**
	 * Edits the.
	 *
	 * @param login the login
	 * @return the string
	 */
	@RequestMapping(value="/editdata")
	public String edit(Loginbean login){
		System.out.println("In Edit Method");
		
		// dao.editbyId();
		
		
		return "welcome";
	}

	/**
	 * Retriveby id.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value="/fetchbyId/{id}")
	public String retrivebyId(@PathVariable Integer id,Model model){
		System.out.println("In fetchbyId Method");
		
		Loginbean j = dao.retriveusingId(id);
		model.addAttribute("byId", j);
		
		
		return "welcome";
	}
}
