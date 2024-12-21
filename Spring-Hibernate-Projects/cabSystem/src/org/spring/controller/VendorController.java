package org.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.spring.dto.VendorBeans;
import org.spring.services.VendorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendorController {

	@Autowired
	VendorServices vendorServices;
	
	@RequestMapping(value="/addVendors")
	public String vendorsPageRedirect(){
	
		
		return "addVendor";
	}
	
	@RequestMapping(value="/saveVendors")
	public String saveVendorsData(VendorBeans vendorBeans,HttpServletRequest request){
	
		int mId = (int) request.getSession().getAttribute("mId");
		vendorBeans.setmId(mId);
		vendorServices.saveVendorsDetails(vendorBeans);
		return "welcome";
	}
	
	@RequestMapping(value="/detailsVendors")
	public String vendorDetailsSelected(VendorBeans vendorBeans,Model model){
	
		List<VendorBeans> vendorList = vendorServices.vendorDetailsSelected(vendorBeans);
		model.addAttribute("vendorList", vendorList);
		return "vendorDetails";
	}
	
}
