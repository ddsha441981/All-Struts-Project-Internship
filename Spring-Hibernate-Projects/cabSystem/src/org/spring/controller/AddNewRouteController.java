package org.spring.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.spring.dto.AddDriverBeans;
import org.spring.dto.AddRouteBeans;
import org.spring.services.AddRouteServices;
import org.spring.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.security.auth.login.ConfigFile;

@Controller
public class AddNewRouteController {

	@Autowired
	AddRouteServices addRouteService;
	
	@Autowired
	DriverService driverService;

	
	final public static Logger logger =Logger.getLogger(AddNewRouteController.class);
	 //String log4jmsg ="I:\\Eclipse\\Spring-Hibernate-Projects\\cabSystem\\resources\\MsgLog4J.properties";
	//final public static Logger loggerError =Logger.getLogger(AddNewRouteController.class);
	// String log4jerror ="I:\\Eclipse\\Spring-Hibernate-Projects\\cabSystem\\resources\\ErrorLog4JError.properties";
	//final public static Logger loggerDebug =Logger.getLogger(AddNewRouteController.class);
	// String log4jdebug ="I:\\Eclipse\\Spring-Hibernate-Projects\\cabSystem\\resources\\DebugLog4J.properties";
	 
	
	
	
	@RequestMapping(value="/addNewRoute")
	public String routePageRedirect(AddDriverBeans addDriverBeans,Model model){
		//PropertyConfigurator.configure(log4jmsg);
		logger.info("Request mapping Successfully");
		List<AddDriverBeans> driverList = driverService.selectedIdForDriver(addDriverBeans);
		
		//System.out.println("In Controller of Route here driver Id is"+driverList);
		
		logger.info("In Controller of Route here driver Id is"+driverList);
		/*for(Iterator i = driverList.iterator();i.hasNext();)
		{
			AddDriverBeans ad = (AddDriverBeans)i.next();
			System.out.println(ad.getDriverId());
		}*/
		model.addAttribute("driverList", driverList);
		return "addRoute";
	}
	
	@RequestMapping(value="/saveMyRouteDatils")
	public String saveRoutesDetails(AddRouteBeans addRouteBeans,HttpServletRequest request){
		
		logger.info("Request SuccessFully mapped");
		/*int driverId = (int) request.getSession().getAttribute("driverId");
		addRouteBeans.setDriverId(driverId);
	*/	
		//System.out.println("Here Driver Id is "+driverId);
		
		int mId = (int) request.getSession().getAttribute("mId");
		
		logger.info("Manager Id Set Here");
		
		addRouteBeans.setmId(mId);
		
		addRouteService.saveRouteData(addRouteBeans);
		return "welcome";
	}
	
	@RequestMapping(value="/viewRouteDetails")
	public String detailsListOfRoutes(AddRouteBeans addRouteBeans ,Model model){
		
		
		List <AddRouteBeans> routeList = addRouteService.infoViewsRoutes(addRouteBeans);
		
		model.addAttribute("routeList", routeList);
		return "viewRouteDetail";
	}
}
