package org.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.spring.dto.AddDriverBeans;
import org.spring.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DriverController {

	@Autowired
	DriverService driverService;

	@RequestMapping(value = "/addDrivers")
	public String addDriverPageRedirect() {

		return "addDriver";
	}

	@RequestMapping(value = "/saveDriversDetails")
	public String addDriverSave(AddDriverBeans addDriverBeans, HttpServletRequest request) {

		// manager id get and set using seesion
		int mId = (int) request.getSession().getAttribute("mId");
		System.out.println("Here Maintain Manager Id is" + mId);
		addDriverBeans.setmId(mId);

		int status = driverService.saveDriversContents(addDriverBeans);
		
			System.out.println("Records Added SuccessFully" + status);
			return "welcome";
		
	}

	@RequestMapping(value = "/viewDetailsDriverData")
	public String viewDriversDetails(AddDriverBeans addDriverBeans, Model model) {

		List<AddDriverBeans> driverList = driverService.selectDriverDetails(addDriverBeans);
		model.addAttribute("driverList", driverList);

		return "viewDriverDetails";
	}

}
