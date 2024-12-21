package org.spring.Controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

/**
* @author Deendayal Kumawat
* @since 14 march 2017
* @version 1.2.5
*/
import org.spring.bean.Employeebeans;
import org.spring.model.EmployeeModel;
import org.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
@author Deendayal Kumawat
@since 14 march 2017
@version 1.2.5
*/

@Controller
public class EmployeeController {

	@Autowired(required = true)
	EmployeeService employeeservice;
	
	@RequestMapping(value = "/redirectIndexPageToemployeePage")
	public String redirectPage(@ModelAttribute("employee") Employeebeans employeebeans,BindingResult bindingResult,Model model){
		Employeebeans beans = new Employeebeans();
		model.addAttribute("addmyEmployess", beans);
		
		System.out.println("In Method");
		
		return "addEmployees";
	}
	
	@RequestMapping(value = "/saveMyemployees",method = RequestMethod.POST)
	public String newaddEmployees(@ModelAttribute("employee")@Valid Employeebeans employeebeans , BindingResult bindingResult,Model model){
		
		EmployeeModel employeeModel = prepareModel(employeebeans);
		/*if(bindingResult.hasErrors()){
			
			return "addEmployees";
			
		}
		
		else{
			*/
		employeeservice.addEmployess(employeeModel);
			
			return "success";
		//}
		
	}
	
	@RequestMapping(value = "/listofAllemployess")
	public String listemployees(EmployeeModel employeeModel,Model mode){
		
		List<Employeebeans> list = prepareListofBean(employeeservice.getallOfEmployees());
		list.toString();
		mode.addAttribute("empList", list);
		return "addEmployees";
		
	}

	private EmployeeModel prepareModel(Employeebeans employeebeans){
		EmployeeModel employeeModel = new EmployeeModel();
		employeeModel.setEmpAdd(employeebeans.getEmpAdd());
		employeeModel.setEmpAge(employeebeans.getEmpAge());
		employeeModel.setEmpsalary(employeebeans.getEmpsalary());
		employeeModel.setEmpName(employeebeans.getEmpName());
		employeeModel.setEmpId(employeebeans.getEmpId());
		 // employeebeans.setEmpId(null);
		  return employeeModel;
}
	
	private List<Employeebeans> prepareListofBean(List<EmployeeModel> employeeModel){
		  List<Employeebeans> beans = null;
		  if(employeeModel != null && !employeeModel.isEmpty()){
		   beans = new ArrayList<Employeebeans>();
		   Employeebeans bean = null;
		   for(EmployeeModel employee : employeeModel){
		    bean = new Employeebeans();
		    bean.setEmpAdd(employee.getEmpAdd());
		    bean.setEmpId(employee.getEmpId());
		    bean.setEmpAdd(employee.getEmpAdd());
		    bean.setEmpsalary(employee.getEmpsalary());
		    bean.setEmpAge(employee.getEmpAge());
		    beans.add(bean);
		   }
		  }
		  return beans;
		 }
}
