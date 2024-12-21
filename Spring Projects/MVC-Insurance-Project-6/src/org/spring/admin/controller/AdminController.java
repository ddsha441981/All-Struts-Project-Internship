package org.spring.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.admin.beanclasses.AdminLoginbean;
import org.spring.admin.beanclasses.RegisterAgent;
import org.spring.admin.repositries.AdminDao;
import org.spring.agent.beanofAgent.PolicyHolderRegister;
import org.spring.agent.beanofAgent.PolicyregisterOfClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class AdminController {
	@Autowired
	AdminDao dao;
	public static final Logger logger = Logger.getLogger(AdminController.class);
	
	/**
	 *  admin() is method name of controller
	 * @parm createAdminTable() method used to Create table
	 *  saveAdminTableData() method used to save data in database
	 *  getloginAdmin() method used to login
	 *  Request Mapping when Agent Login
	 *  adminlogin is form action
	 *  Used model to show some message
	 *  Return type is String and return adminhome.jsp page
	 */
	@RequestMapping(value="/adminlogin",method=RequestMethod.POST)
	public String admin(AdminLoginbean adminlogin,Model model) {
		
		logger.info("Admin Login Method Executed");
		//dao.createAdminTable();
		//dao.saveAdminTableData(adminlogin);
		int loginId = dao.getloginAdmin(adminlogin);
		if(loginId>0){
			
			AdminLoginbean  adminlist =  dao.viewProfileofAdminById(loginId);
			
			model.addAttribute("admin", adminlist);
		}
		else{
			return "error";
		}
		// log message
		logger.info("Successfully Login");
		
		return "adminhome";
	}

	/**
	 *  policyregister() is method name of controller
	 *  Request Mapping when Agent Login
	 *  addpolicybyAdmin is form action
	 *  Used model to show some message
	 *  getallpolicyofAdmin() method is used to retrive data from data base and their body is define dao class 
	 *  policy is referance of List
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return policyregister.jsp page
	 */
	@RequestMapping("/addpolicybyAdmin")
	public String policyregister(Model model) {
	
		// log message
		logger.info("Policy Register Method Executed");
		
		List<AddnewPolicy> policy = dao.getallpolicyofAdmin();
		
		// log message
		logger.info("Successfully Retrive Data of Policy");
		
		model.addAttribute("policylist", policy);
		return "policyregister";
	}

	/**
	 *  policyrsave() is method name of controller
	 *  AddnewPolicy is class and their referance is addpolicy
	 *  Request Mapping when Agent Login
	 *  savepolicy is form action
	 *  Used model to show some message
	 *  savepolicybyAdmin() method is used to save data in database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return policyregister.jsp page
	 */
	@RequestMapping("/savepolicy")
	public String policyrsave(AddnewPolicy addpolicy, Model model) {
		
		// dao.createpolicytable();
		dao.savepolicybyAdmin(addpolicy);

		// logs method message
		logger.info("Method Execute");

		model.addAttribute("policymsg1", "Policy Addded Successfully");

		// logs exception
		logger.error("This is Error message", new Exception("Testing"));
		// log message
		logger.info("Exiting Method");
		return "policyregister";
	}
	
	
	/**
	 *  adminregisteragent() is method name of controller
	 *  Request Mapping when Agent Login
	 *  adminregister is form action
	 *  Used model to show some message
	 *  getallAgentofAdmin() method is used to retrive data from data base and their body is define dao class 
	 *  list is referance of List
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return agent-register.jsp page
	 */
	@RequestMapping("/adminregister")
	public String adminregisteragent(Model model) {
		
		// log message
		logger.info("Admin Register Agents Method Executed");
		List<RegisterAgent> list = dao.getallAgentofAdmin();
		model.addAttribute("listofagent",list);
		return "agent-register";
	}
	
	/**
	 *  saveagent() is method name of controller
	 *  Request Mapping when Agent Login
	 *  saveagentbyAdmin is form action
	 *  Used model to show some message
	 *  Return type is String and return agent-register.jsp page
	 *
	 */
	@RequestMapping("/saveagentbyAdmin")
	public String saveagent(Model model) {
	
		// log message
		logger.info("Admin Register Agents Method Executed");
		// logs message
		logger.info("successfully Saved Data");

		model.addAttribute("agentsave", " Records Successfully saved ");
		return "agent-register";
	}

	/**
	 *  saveAgentByAdmin() is method name of controller
	 *  RegisterAgent is class and their referance is registeragent
	 *  Request Mapping when Agent Login
	 *  saveAgentByAdmin is form action
	 *  Used model to show some message
	 *  saveagent() method is used to save data in database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return agent-register.jsp page
	 */
	@RequestMapping("/saveAgentByAdmin")
	public String saveAgentByadmin(RegisterAgent registeragent, Model model) {
		
		// log message
		logger.info("Admin Register Agents Method Executed");
		 //dao.createtableOfsaveAgent();
		dao.saveagent(registeragent);
		
		// logs message
		logger.info("successfully Saved Data");
		return "agent-register";
	}

	/**
	 *  viewClient() is method name of controller
	 *  PolicyHolderRegister is class and their referance is policyhoderdata
	 *  Request Mapping when Admin want to view all clients data
	 *  viewallofClientAddedByAgent is  action
	 *  Used model used to pass obj of PolicyHoder class
	 *  viewofPolicyhoderContents() method is used to Retrive data From database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return allClientdata.jsp page
	 */
	@RequestMapping(value="/viewallofClientAddedByAgent")
	public String viewClient(Model model){
		// log message
		logger.info("PolicyHoders view all Data By Admin Method Executed");
		
		List<PolicyHolderRegister> listofclients = dao.viewofPolicyhoderContents();
		//System.out.println("//////////////////////////"+listofclients);
		model.addAttribute("allclients",listofclients);
		
		return "allClientdata";
	}
	
	/**
	 *  fetchClientdata() is method name of controller
	 *  PolicyHolderRegister is class
	 *  Request Mapping when Admin want to select clients data using Their Id
	 *  selectClientInfoById is  action
	 *  Used model used to pass a msg to admin that data select successfully from database
	 *  fetchByIdOfClientsInfo() method is used to retrive data From database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return editclientByAdmin.jsp page
	 */
	@RequestMapping(value="/selectClientInfoById/{clientId}")
	
	public String fetchClientdata(@PathVariable Integer clientId,Model model){
		// log message
		logger.info("Admin Edit Information of Client");
		System.out.println("Edit Method method executed"+clientId);
		PolicyHolderRegister S1 = dao.fetchByIdOfClientsInfo(clientId);
		
		model.addAttribute("setIdByIdOfClients", S1);
		
		return "editclientByAdmin";
	}
	
	/**
	 *  editclientByUsingIdAdmin() is method name of controller
	 *  PolicyHolderRegister is class
	 *  Request Mapping when Admin want to edit clients data using Their Id
	 *  editClientInfomartionsByAdmin is  action
	 *  Used model used to pass a msg to admin that data select successfully from database
	 *  fetchByIdOfClientsInfo() method is used to retrive data From database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return editclientByAdmin.jsp page
	 */
	@RequestMapping(value="/editClientInfomartionsByAdmin",method=RequestMethod.POST)
	
	public String editclientByUsingIdAdmin(@ModelAttribute PolicyHolderRegister holderregister){
		// log message
		logger.info("Admin Edit Information of Client");
		System.out.println("Update Method method executed" +holderregister.getClientId());
		
		dao.updateClientByAdmin(holderregister);
		
		return "allClientdata";
	}
	
	/**
	 *  deleteclient() is method name of controller
	 *  PolicyHolderRegister is class
	 *  Request Mapping when Admin want to delete clients data
	 *  deleteClientInfo is  action
	 *  Used model used to pass a msg admin to delete
	 *  deleteInfoClient() method is used to delete data From database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return allClientdata.jsp page
	 *  @ResponseBody used to Ajax Call
	 */
	@RequestMapping(value="/deleteClientInfo",method = RequestMethod.POST)
	@ResponseBody
	public String deleteclient(@RequestParam Integer clientId,Model model){
		// log message
		logger.info("Admin Delete Information of Client");
		System.out.println("delete method executed"+clientId);
		dao.deleteInfoClient(clientId);
		
		return "allClientdata";
	}
	
	/**
	 *  policyRegisterByAdminUsing() is method name of controller
	 *  AddnewPolicy is class and their referance is addpolicy
	 *  Request Mapping when Agent Login
	 *  savepolicy is form action
	 *  Used model to show some message
	 *  savepolicybyAdmin() method is used to save data in database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return policyregister.jsp page
	 */
	@RequestMapping(value="/adminviewAndDeleteDataOfPolicy")
	public String policyRegisterByAdminUsing(Model model){
		
		List<PolicyregisterOfClients> adminviewEditdelete  = dao.adminclientspolicyAddedByAgentByhim();
		model.addAttribute("adminViewDbyAgent", adminviewEditdelete);
		
		System.out.println("Admin Can view delete Policy details Added By him");
		return "adminViewAllpolicyOfClient";
	}
	
	/**
	 *  retriveallpolicyofClients() is method name of controller
	 *  PolicyHolderRegister is class
	 *  Request Mapping when Admin want to select clients data using Their Id
	 *  selectClientInfoById is  action
	 *  Used model used to pass a msg to admin that data select successfully from database
	 *  fetchByIdOfClientsInfo() method is used to retrive data From database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return editclientByAdmin.jsp page
	 */
	@RequestMapping(value="/selectClientpoliciesUsingById/{policyNo}")
	
	public String retriveallpolicyofClients(@PathVariable Integer policyNo,Model model){
		// log message
		logger.info("Admin Edit Information of Client policy");
		System.out.println("Edit Method method executed"+policyNo);
		PolicyregisterOfClients PP1 = dao.retriveOfPoliciesOfClients(policyNo);
		
		model.addAttribute("retrivepolicy", PP1);
		
		return "admineditClientsPolicyAddedByAgent";
	}
	
	/**
	 *  clientspolicyUpdated() is method name of controller
	 *  PolicyregisterOfClients is class
	 *  Request Mapping when Admin want to edit clients data using Their Id
	 *  editpolicyofClientByAdminUsingTheirId is  action
	 *  Used model used to pass a msg to admin that data edit successfully from database
	 *  updatepolicyAddedByAgentByAdmin() method is used to retrive data From database and their body is define dao class 
	 *  AdminDao is class and their referance is dao
	 *  Return type is String and return adminViewAllpolicyOfClient.jsp page
	 */
	@RequestMapping(value="/editpolicyofClientByAdminUsingTheirId",method=RequestMethod.POST)
	
	public String clientspolicyUpdated(@ModelAttribute PolicyregisterOfClients clientsregisterpolicyEdit){
		// log message
		logger.info("Admin Edit Information of Client");
		System.out.println("Update Method method executed" +clientsregisterpolicyEdit.getPolicyNo());
		
		dao.updatepolicyAddedByAgentByAdmin(clientsregisterpolicyEdit);
		
		return "adminViewAllpolicyOfClient";
	}
}
