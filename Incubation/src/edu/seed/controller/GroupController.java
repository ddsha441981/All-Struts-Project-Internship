package edu.seed.controller;

import java.util.List;
import java.sql.*;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.seed.dto.GroupBean;
import edu.seed.dto.RegistrationBean;
import edu.seed.service.GroupService;

@Controller
public class GroupController {
	
	
	
	final static Logger logger = Logger.getLogger(GroupController.class);
	String log4jFile="Z:\\Incubation\\resource\\log4j.properties";//log4j setting path of file
	
	

	@Autowired(required = true)
	GroupService groupService;

	/*
	 * @author : Abhaysingh
	 * 
	 * @param : model to set object of loginBean class
	 * 
	 * @return : String name of the Jsp page (select batch and display)
	 * 
	 * @ since :April 04-2017
	 */

	@RequestMapping(value = "Group")
	public String redirectToView(Model model, GroupBean groupBean, HttpServletRequest request) {

		model.addAttribute("groupBean", new GroupBean());

		int regIdSession = (Integer) request.getSession().getAttribute("userid");
		groupBean.setPm_id(regIdSession);

		List<GroupBean> getAllGroup = groupService.viewgroup(groupBean);
		model.addAttribute("getAllGroup", getAllGroup);

		List<GroupBean> getBatchName = groupService.selectBatch(groupBean);
		model.addAttribute("getBatchName", getBatchName);

		System.out.println(getBatchName);

		System.out.println(groupBean.getUserid());

		return "group";
	}

	
	
	
	
	
	/***
	 @author :spic6_3
	  
     @return :list of Interns for particular batch
	 
	 @since  :08 April 2017
	 
	 */
	 
	
	@RequestMapping("/selectbatch")
	@ResponseBody
public  String selectIntern(@ModelAttribute("groupBean") GroupBean groupBean,Model model ){
		
	
		
	//System.out.println("Inside InternList");
	
	
		List<RegistrationBean>  viewInternBeanRow=groupService.getInternName(groupBean);
		model.addAttribute("viewInternBeanRow",viewInternBeanRow);
	//	System.out.println(viewInternBeanRow);
		String options="";
		for(RegistrationBean bean : viewInternBeanRow){
			options+="<option value="+bean.getUserid()+">"+bean.getName()+"</option>";
			
		
			
		}

	//	System.out.println(options);
		logger.info("list of Intern displayed");
	//	System.out.println(viewInternBeanRow);
		return options;
	}
	
	
	/**   Add Group
	 @author Abhay singh solanki
	 @since  10 April 2017
	 @param  Model to set object of GroupBean class
	 @return   String name of the jsp page
	 */

@RequestMapping("/NewGroup")
@ResponseBody
public  String SaveGroup(@ModelAttribute("groupBean") GroupBean groupBean,Model model ,BindingResult result,HttpServletRequest request)
{
	
	System.out.println("Inside the save Group");

/*logger.info("inside SaveGroup method");
PropertyConfigurator.configure(log4jFile);*/

int regIdSession = (Integer) request.getSession().getAttribute("userid");
groupBean.setPm_id(regIdSession);

int SaveGroupBeanRow=0;

model.addAttribute("groupBean", groupBean);
String groupExixts="";
Boolean isGroupExixts=groupService.isGroupExists(groupBean);//1
System.out.println("returned value"+isGroupExixts);
if(isGroupExixts==true)                                     //2
{
	System.out.println("already exits");
	 groupExixts = "error";
	return groupExixts; 
}
else
{
System.out.println("ready to save"+groupBean.getG_startdate());
SaveGroupBeanRow=groupService.SaveGroup(groupBean);
if(SaveGroupBeanRow >0)
{

	System.out.println("group add");
	groupExixts = "success";
	return groupExixts;
}
	
	
	//System.out.println(SaveGroupBeanRow);

//logger.warn("SaveGroup method Ends");
  return "group";
}
}


/* This method is use to delete intern group .
 *@author -Abhay solanki
 * @param -Model to set object of GroupBean class
 * @return -String name of the jsp page
 * @since - April2017 */ 
@RequestMapping("/deleteGroup")
@ResponseBody
public String deleteGroup(@ModelAttribute("groupBean") GroupBean groupBean,Model model)
{

	System.out.println("\n Inside delete controller");
	
	String DeleteGroup="";
	
	model.addAttribute("groupBean", groupBean); 
	
	System.out.println(groupBean.getG_id());
	logger.info("inside deleteGroup method");
	PropertyConfigurator.configure(log4jFile);
	 int deleteGroupBeanRow=groupService.deleteGroup(groupBean);
	if(deleteGroupBeanRow >0)
	
		System.out.println("inside delete");
		DeleteGroup="delete";
	
	logger.warn("deleteGroup method Ends");
	return DeleteGroup;
} 


/* method is used for update the group 
 @author - Abhay singh solanki
 @param  - model to set object of the GroupBean class
 @return - String name of jsp page
 @since  -17 April 2017 
 */

@RequestMapping(value="/updategrp",method=RequestMethod.POST)
@ResponseBody
public String update(@ModelAttribute("groupBean") GroupBean groupBean,Model model)
{
	System.out.println("group id is inside controller"+groupBean.getG_id());
	
	System.out.println("\n Inside the update ");
	
	
	model.addAttribute("groupBean",groupBean);
	
	String data="";
	  Boolean isGroupExixts=groupService.isGroupExists(groupBean);  //1
	  if(isGroupExixts==true)
		{
			System.out.println("already exits");
			data="error";
			return data;
			
			}
	  else                                                      //2
	  {                   
	
	int updateGroup=groupService.updateGroup(groupBean);
	if(updateGroup >0)                                      //3
	{
	
		System.out.println("group  add");
		data="success";
		return data;
	}
	
	
	
/*	return Integer.toString(updateGroup);*/
	  }
	  return "group";
}


	
	/***  This method is used to view intern list 
	 * @param: integer value
	 * @author spic6_3
	 * @since 19 th may 2017
	 * */ 

@RequestMapping(value="/editgroup", method=RequestMethod.POST)
@ResponseBody
public String SelectINtern(GroupBean groupBean,HttpServletRequest request)
{
	System.out.println("Group Id get to the ajax"+groupBean.getG_id());
	System.out.println("\n Inside the list");
String data="";
	int regIdSession = (Integer) request.getSession().getAttribute("userid");
	groupBean.setPm_id(regIdSession);
	groupBean.getG_id();
	List<RegistrationBean> internbeanRow=groupService.viewIntern(groupBean);
	System.out.println("group intern list"+groupBean.getName());
for(RegistrationBean bean: internbeanRow)
{
	data+="<tr><td>"+bean.getName()+"</td><tr>";
	System.out.println(data);
}
	
	return data;
}






	
}
			



