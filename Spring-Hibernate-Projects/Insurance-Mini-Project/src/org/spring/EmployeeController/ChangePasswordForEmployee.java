package org.spring.EmployeeController;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.EmployeeBeans.EmployeeChangePwdBeans;
import org.spring.EmployeeDaoImpl.EmployeeChangePwdDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChangePasswordForEmployee {

	public static Logger  logger = Logger.getLogger(ChangePasswordForEmployee.class);
	
	@Autowired(required = true)
	EmployeeChangePwdDao empchangePwdDao;
	
	@RequestMapping(value="changeOwnPasswordByEmployee",method = RequestMethod.POST)
	public String changePasswordOfEmp(EmployeeChangePwdBeans employeeChangePwdBeans,Model model,HttpServletRequest request){
		
		logger.info("Change Password Method Successfully Executed");
		
		int empId = (int) request.getSession().getAttribute("empId");
		employeeChangePwdBeans.setEmpId(empId);
		
		empchangePwdDao.changePasswordEmployee(employeeChangePwdBeans);
		
		logger.info("Employee Password Successfully Changed");
		model.addAttribute("msg", "Employee Password Successfully Changed");
		return "employeeProfile";
	}
}
