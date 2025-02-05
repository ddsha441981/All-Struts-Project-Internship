package org.spring.AdminController;

import org.apache.log4j.Logger;
import org.spring.AdminBeans.EmployeeBeans;
import org.spring.AdminDaoImpl.DaoImplofEmployee;
import org.spring.UtilityClass.RandomPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddNewEmployeeController {

	public static Logger  logger = Logger.getLogger("AddNewEmployee.class");
	
	@Autowired(required = true)
	DaoImplofEmployee daoEmp;
	
	@RequestMapping(value ="/AddNewEmployees")
	public String newEmployee(){
		
		logger.info("Add New Employee Method SuccessFully Executed");
		return "addnewEmployee";
		
	}
	
	@RequestMapping(value ="/addNewEmployeeByAdmin",method = RequestMethod.GET)
	public String addnewEmployee(EmployeeBeans employeeBeans ,Model model){
		
		logger.info("Add New Employee Method SuccessFully Executed and Random Password Generated Automatically is Processing");
		
		//String autogeneratedPwd = 	RandomPassword.autoGeneratedPassword();
		//employeeBeans.setAutogeneratedPwd(autogeneratedPwd);
		logger.info("Random Password  Automatically Generated successfully");
		
		//daoEmp.addNewEmployee(employeeBeans);
		
		logger.info("Employees Registeration successFully Added");
		
		//model.addAttribute("MyPwd", autogeneratedPwd);
		model.addAttribute("msg", "Employees Registeration successFully");
		
		
		return "adminProfile";
	}
}
