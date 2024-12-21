package org.spring.Controller;

import org.apache.log4j.Logger;
import org.spring.Beans.AdminBeans;
import org.spring.Beans.StudentBeans;
import org.spring.Beans.TrainerBeans;
import org.spring.Service.ChangePasswordService;
import org.spring.Service.ForgotPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/***
 * @author : Deendayal
 * 
 * @param : model to set object of ChangePassword  Controller class
 * 
 * @return : String name of the Jsp page (Change Password Using Role)
 * 
 * @ since :June 29-2017
 */
@Controller
public class ChangPasswordController {

	@Autowired(required =true)
	ChangePasswordService changePasswordService;
	
	/**
	 * Logger file
	 * @return properties  file
	 * @since  :June 30-2017
	 */
	final static Logger msglogger = Logger.getLogger(ChangPasswordController.class);
	String logMsg = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\msgLog4J.properties";
	
	final static Logger errorlogger = Logger.getLogger(ChangPasswordController.class);
	String logError = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\errorLog4J.properties";
	
	final static Logger debuglogger = Logger.getLogger(ChangPasswordController.class);
	String logDebug = "I:\\Eclipse\\Spring-Hibernate-Projects\\e-Learning-System\\resources\\debugLog4J.properties";
	
	
	/**
	 * Handle request to the Admin Change Password and page redirect
	 * adminPassword() Method
	 * @return jsp page
	 * @since  :June 29-2017
	 */
	@RequestMapping(value="/adminChangePassword")
	public String adminPassword(){
		
		return "adminChangePassword";
	}
	
	/**
	 * Handle request to the Admin Change Password after submit data
	 * adminPassword() Method
	 * @return jsp page
	 * @since  :June 29-2017
	 */
	@RequestMapping(value="/afterSubmitingAdminPassword")
	public String submitadminPassword(AdminBeans adminBeans,Model model){
		
		AdminBeans isExistEmailAdmins = changePasswordService.changePasswordByAmin(adminBeans);
		
		if(isExistEmailAdmins == null){
			model.addAttribute("Email Doesn't Exists ", isExistEmailAdmins);
			return "Error";
		}
		else{
			int adminStatus = changePasswordService.updatedpwdExistedEmailAdmin(adminBeans);
			model.addAttribute("Password Change SuccessFully", adminStatus);
			return "adminProfile";
		}
		
	}
	
	/**
	 * Handle request to the Trainer Change Password and page redirect
	 * adminPassword() Method
	 * @return jsp page
	 * @since  :June 29-2017
	 */
	@RequestMapping(value="/trinerChangePassword")
	public String trianerPassword(){
		
		return "trainerChangePassword";
	}
	

	/**
	 * Handle request to the Trainer Change Password after submit data
	 * adminPassword() Method
	 * @return jsp page
	 * @since  :June 29-2017
	 */
	@RequestMapping(value="/submitingTrinerChangePassword")
	public String submitTrianerPassword(TrainerBeans trainerBeans,Model model){
		System.out.println("after submit");
		TrainerBeans isExistEmailTrainer = changePasswordService.changePasswordByTrainer(trainerBeans);
		if(isExistEmailTrainer == null){
			model.addAttribute("Email Doesn't Exists ", isExistEmailTrainer);
			return "Error";
		}
		else{
			int trainerStatus = changePasswordService.updatedpwdExistedEmailTrainer(trainerBeans);
			model.addAttribute("Password Change SuccessFully", trainerStatus);
			return "trianerProfile";
		}
		
	}
	
	/**
	 * Handle request to the Student Change Password and page redirect
	 * adminPassword() Method
	 * @return jsp page
	 * @since  :June 29-2017
	 */
	@RequestMapping(value="/studentChangePassword")
	public String studentPassword(){
		
		return "studentChangePassword";
	}
	
	/**
	 * Handle request to the Student Change Password after submit data
	 * adminPassword() Method
	 * @return jsp page
	 * @since  :June 29-2017
	 */
	@RequestMapping(value="/submitingStudentChangePassword",method = RequestMethod.POST)
	public String submitingStudentPassword(StudentBeans studentBeans,Model model){
		
		StudentBeans isExistEmailStudent = changePasswordService.changePasswordByStudent(studentBeans);
		if(isExistEmailStudent == null){
			model.addAttribute("Email Doesn't Exists ", isExistEmailStudent);
			return "Error";
		}
		else{
			int studentStatus = changePasswordService.updatedpwdExistedEmailStudent(studentBeans);
			model.addAttribute("Password Change SuccessFully", studentStatus);
			return "studentProfile";
		}
		
	}
}
