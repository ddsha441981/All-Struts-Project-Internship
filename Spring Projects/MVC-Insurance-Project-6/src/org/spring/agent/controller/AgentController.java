package org.spring.agent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.spring.admin.beanclasses.AddnewPolicy;
import org.spring.admin.beanclasses.RegisterAgent;
import org.spring.agent.beanofAgent.Agentlogin;
import org.spring.agent.beanofAgent.PolicyHolderRegister;
import org.spring.agent.beanofAgent.PolicyregisterOfClients;
import org.spring.agent.repositries.AgentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
public class AgentController {

	@Autowired(required=true)
	AgentDao Adao;
	
	public static final Logger logger = Logger.getLogger(AgentController.class);

	/**
	 *  agent() is method name of controller
	 *  viewAgentProfileUsingById() method used to retrive data From Database for Particular Agent Using Their Id
	 *  Request Mapping when Agent Login
	 *  agentlogin is form action
	 *  Used model to show some message
	 *  Return type is String and return agentprofile.jsp page
	 */
	@RequestMapping(value="/agentlogin",method=RequestMethod.POST)
	public String agentLogin(Agentlogin agentlogin,Model model,HttpServletRequest request) {
		
		int id = Adao.getlogin(agentlogin);
		if(id>0){
			request.getSession().setAttribute("aId", id);
			RegisterAgent singleofAgent = Adao.viewAgentProfileUsingById(id);
			System.out.println("Here................................................."+id);
			model.addAttribute("profileOfAgent",singleofAgent );
			// logs message
			logger.info("Agent Login SuccessFully");
			
		}
		else{
			
			return "error";
			
		}
		return "agentprofile";
		
	}
	
	/**
	 *  fetchClientdata() is method name of controller
	 *  fetchByIdOfAgentInfo() method used to retrive data From Database for Particular Agent Using Their Id
	 *  Request Mapping when Agent update their own profile
	 *  updateOwnProfileByAgent is form action
	 *  Used model to show some message
	 *  Return type is String and return editAgentProfileByhim.jsp page
	 */
	@RequestMapping(value="/updateOwnProfileByAgent/{agentId}")
	
	public String fetchClientdata(@PathVariable Integer agentId,Model model){
		// log message
		logger.info("Agent Edit own Information");
		System.out.println("Edit Method method executed"+agentId);
		RegisterAgent agentinfo = Adao.fetchByIdOfAgentInfo(agentId);
		
		model.addAttribute("infoOfAgent", agentinfo);
		
		return "editAgentProfileByhim";
	}
	
	@RequestMapping(value="/editClientInfomartionsByAgent")
	public String editdataOfAgentProfileAfterSubmit(RegisterAgent agentofown){
		// log message
				logger.info("Agent Edit Information of Own");
				System.out.println("After update data on Submiting");
				Adao.updateTheirProfileByAgent(agentofown);
		return "agentprofile";
		
	}
	
	
	/**
	 *  agentviewallclientAddedbyhim() is method name of controller
	 *  Request Mapping when Agent Login
	 *  viewallclientbyAgent is form action
	 *  Used model to show some message
	 *  Return type is String and return client-register.jsp page
	 */
	@RequestMapping(value="/viewallclientbyAgent/{aId}")
	public String agentviewallclientAddedbyagentId(@PathVariable Integer aId,Model model) {
		System.out.println("view Method"+aId);
		
		// logs message
		logger.info("Agent view all Client Added By him");

		//List clientviewById = Adao.viewalldataofclientbyagentbyId();
		PolicyHolderRegister clientviewById = Adao.viewalldataofclientbyagentbyId(aId);
		
		// logs exception
		logger.error("This is Error message", new Exception("Testing"));
		// log message
		model.addAttribute("viewbyId", clientviewById);
		logger.info("Exiting Method");

		return "client-register";
	}

	/**
	 *  saveclientbyagent() is method name of controller
	 *  createtabletoregisterclient() used to create table
	 *  saveallofclientbyagent(client) used to save data into database and client is referance 
	 *  Request Mapping when Agent Login
	 *  client is referance of PolicyHolderRegister bean class
	 *  registerclientbyAgent is form action
	 *  Used model to show some message
	 *  Return type is String and return client-register.jsp page
	 *  aId is a Session Id Of Agent Primary key and Client Foreign key 
	 */
	@RequestMapping(value="/registerclientbyAgent",method=RequestMethod.POST)
	public String saveclientbyagent(PolicyHolderRegister client,Model model,HttpServletRequest request) {
		System.out.println("register method");
	
		// logs message
		logger.info("Agent Register Client");
		//System.out.println("Here Session Id is................."+request.getSession().getAttribute("aId"));
		int id = (int) request.getSession().getAttribute("aId");
		client.setAgentId(id);
		System.out.println("In Save Method Agent Id is "+id);
		
		//methods calling
	//	Adao.createtabletoregisterclient();
		Adao.saveallofclientbyagent(client);
		
		model.addAttribute("msgofpolicyholder", "Data Save In DataBase Successfully");
		
		// log message

		logger.info("Exiting Method");

		return "client-register";
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
	@RequestMapping(value="/agentRegisterClientsPolicy")
	public String policyRegisterByAdminUsing(Model model,HttpServletRequest request){
		
		int agentId = (int) request.getSession().getAttribute("aId");
		System.out.println("Here Id Is "+agentId);
		List<PolicyregisterOfClients> allCLientsPolicy  = Adao.clientspolicyAddedByAgentByhim(agentId);
		model.addAttribute("agentpolicy", allCLientsPolicy);
		
		List<AddnewPolicy> policylists = Adao.allpolicyAddedByAdmin();
		model.addAttribute("allpolicies", policylists);
		
		System.out.println("Agent Can view Policy details Added By him");
		return "policyRegisterandPaydetails";
	}
	
	/**
	 *  policyaddedByAgentofClientsInfo() is method name of controller
	 *  policyaddedByAgentofClientsInfo() is method used to create table 
	 *  PolicyregisterOfClients is class and their referance is policyclients
	 *  Request Mapping when Agent want to add new policy of clients
	 *  clientspolicyPayDetailsByAgent is form action
	 *  Used model to show some message
	 *  savepolicyregisterByAgent() method is used to save data in database and their body is define dao class 
	 *  AgentDao is class and their referance is Adao
	 *  Return type is String and return policyRegisterandPaydetails.jsp page
	 */
	@RequestMapping(value="/clientspolicyPayDetailsByAgent",method=RequestMethod.POST)
	public String policyaddedByAgentofClientsInfo(PolicyregisterOfClients policyclients,HttpServletRequest request){
		System.out.println("Agent  Register Policy of Client");
		//Adao.createtableofNewPolicyOfCLientsInformations();
		
		int agentId = (int) request.getSession().getAttribute("aId");
		policyclients.setAgentId(agentId);
		int clientId = (int) request.getSession().getAttribute("clientOfId");
		policyclients.setClientId(clientId);
		int policyId = policyclients.getPolicyId();
		
		Adao.saveclientspolicyByAgent(policyclients);
		
		return "policyRegisterandPaydetails";
	}
	
	/**
	 * Request Mapping when Agent want to Register New Client of Vehicle
	 * Insurance(Policy Holder)
	 *//*
	@RequestMapping(value="/addnewInsuranceBYAgent{clientId}")
	public String addnewInsuranceByAgeant(Model model) {
		
				// logs message
				logger.info("Agent add new  Insurance of Client SuccessFully");

				model.addAttribute("agentregister", "Welcome Agent in Client Register Form");
				// logs exception
				logger.error("This is Error message", new Exception("Testing"));
				// log message

				logger.info("Exiting Method");
		return "addnewInsurance";
	}*/
	

	/**
	 * Request Mapping when Agent want to Register New Client of Health
	 * Insurance(Policy Holder)
	 */
	@RequestMapping(value="/healthinsurance")
	public String healthInsuranceByAgeant(Model model) {
		System.out.println("Agent add new Health  Insurance of Client");
		// model.addAttribute("agentsave", " Records Successfully saved ");
		return "healthInsurance";
	}

}
